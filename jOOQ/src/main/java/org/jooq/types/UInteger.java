/*
 * Copyright (c) 2011-2017, Data Geekery GmbH (http://www.datageekery.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jooq.types;

import java.io.ObjectStreamException;
import java.math.BigInteger;

import org.checkerframework.checker.signedness.qual.Signed;
import org.checkerframework.checker.signedness.qual.Unsigned;
import org.checkerframework.common.value.qual.PolyValue;

/**
 * The <code>unsigned int</code> type
 *
 * @author Lukas Eder
 * @author Ed Schaller
 * @author Jens Nerche
 */
public final class UInteger extends UNumber implements Comparable<UInteger> {

    private static final Class<UInteger> CLASS                 = UInteger.class;
    private static final String          CLASS_NAME            = CLASS.getName();

    /**
     * System property name for the property to set the size of the pre-cache.
     */
    private static final String          PRECACHE_PROPERTY     = CLASS_NAME + ".precacheSize";

    /**
     * Default size for the value cache.
     */
    private static final int             DEFAULT_PRECACHE_SIZE = 256;

    /**
     * Generated UID
     */
    private static final long            serialVersionUID      = -6821055240959745390L;

    /**
     * Cached values
     */
    private static final UInteger[]      VALUES                = mkValues();

    /**
     * A constant holding the minimum value an <code>unsigned int</code> can
     * have, 0.
     */
    public static final @Unsigned long             MIN_VALUE             = 0x00000000;

    /**
     * A constant holding the maximum value an <code>unsigned int</code> can
     * have, 2<sup>32</sup>-1.
     */
    public static final @Unsigned long             MAX_VALUE             = 0xffffffffL;

    /**
     * A constant holding the minimum value an <code>unsigned int</code> can
     * have as UInteger, 0.
     */
    public static final UInteger         MIN                   = valueOf(MIN_VALUE);

    /**
     * A constant holding the maximum value an <code>unsigned int</code> can
     * have as UInteger, 2<sup>32</sup>-1.
     */
    public static final UInteger         MAX                   = valueOf(MAX_VALUE);

    /**
     * The value modelling the content of this <code>unsigned int</code>
     */
    private final @Unsigned long                   value;

    /**
     * Figure out the size of the precache.
     *
     * @return The parsed value of the system property
     *         {@link #PRECACHE_PROPERTY} or {@link #DEFAULT_PRECACHE_SIZE} if
     *         the property is not set, not a number or retrieving results in a
     *         {@link SecurityException}. If the parsed value is zero or
     *         negative no cache will be created. If the value is larger than
     *         {@link Integer#MAX_VALUE} then Integer#MAX_VALUE will be used.
     */
    private static final int getPrecacheSize() {
        String prop = null;
        long propParsed;

        try {
            prop = System.getProperty(PRECACHE_PROPERTY);
        }
        catch (SecurityException e) {
            // security manager stopped us so use default
            // FIXME: should we log this somewhere?
            return DEFAULT_PRECACHE_SIZE;
        }
        if (prop == null)
            return DEFAULT_PRECACHE_SIZE;

        // empty value
        // FIXME: should we log this somewhere?
        if (prop.length() <= 0)
            return DEFAULT_PRECACHE_SIZE;

        try {
            propParsed = Long.parseLong(prop);
        }
        catch (NumberFormatException e) {
            // not a valid number
            // FIXME: should we log this somewhere?
            return DEFAULT_PRECACHE_SIZE;
        }

        // treat negative value as no cache...
        if (propParsed < 0)
            return 0;

        // FIXME: should we log this somewhere?
        if (propParsed > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        return (int) propParsed;
    }

    /**
     * Generate a cached value for initial unsigned integer values.
     *
     * @return Array of cached values for UInteger
     */
    private static final UInteger[] mkValues() {
        int precacheSize = getPrecacheSize();
        UInteger[] ret;

        if (precacheSize <= 0)
            return null;

        ret = new UInteger[precacheSize];
        for (int i = 0; i < precacheSize; i++)
            ret[i] = new UInteger(i);

        return ret;
    }

    /**
     * Unchecked internal constructor. This serves two purposes: first it allows
     * {@link #UInteger(long)} to stay deprecated without warnings and second
     * constructor without unnecessary value checks.
     *
     * @param value The value to wrap
     * @param unused Unused parameter to distinguish between this and the
     *            deprecated public constructor.
     */
    private UInteger(@Unsigned long value, boolean unused) {
        this.value = value;
    }

    /**
     * Retrieve a cached value.
     *
     * @param value Cached value to retrieve
     * @return Cached value if one exists. Null otherwise.
     */
    @SuppressWarnings("signedness:comparison")
    private static UInteger getCached(@Unsigned long value) {
        if (VALUES != null && value < VALUES.length)
            return VALUES[(int) value];

        return null;
    }

    /**
     * Get the value of a long without checking the value.
     */
    private static UInteger valueOfUnchecked(@Unsigned long value) {
        UInteger cached;

        if ((cached = getCached(value)) != null)
            return cached;

        return new UInteger(value, true);
    }

    /**
     * Create an <code>unsigned int</code>
     *
     * @throws NumberFormatException If <code>value</code> does not contain a
     *             parsable <code>unsigned int</code>.
     */
    @SuppressWarnings("signedness:argument")
    public static UInteger valueOf(String value) throws NumberFormatException {
        return valueOfUnchecked(rangeCheck(Long.parseLong(value)));
    }

    /**
     * Create an <code>unsigned int</code> by masking it with
     * <code>0xFFFFFFFF</code> i.e. <code>(int) -1</code> becomes
     * <code>(uint) 4294967295</code>
     */
    public static UInteger valueOf(@Unsigned int value) {
        return valueOfUnchecked(value & MAX_VALUE);
    }

    /**
     * Create an <code>unsigned int</code>
     *
     * @throws NumberFormatException If <code>value</code> is not in the range
     *             of an <code>unsigned byte</code>
     */
    public static UInteger valueOf(@Unsigned long value) throws NumberFormatException {
        return valueOfUnchecked(rangeCheck(value));
    }

    /**
     * Create an <code>unsigned int</code>
     *
     * @throws NumberFormatException If <code>value</code> is not in the range
     *             of an <code>unsigned int</code>
     */
    private UInteger(@Unsigned long value) throws NumberFormatException {
        this.value = rangeCheck(value);
    }

    /**
     * Create an <code>unsigned int</code> by masking it with
     * <code>0xFFFFFFFF</code> i.e. <code>(int) -1</code> becomes
     * <code>(uint) 4294967295</code>
     */
    private UInteger(@Unsigned int value) {
        this.value = value & MAX_VALUE;
    }

    /**
     * Create an <code>unsigned int</code>
     *
     * @throws NumberFormatException If <code>value</code> does not contain a
     *             parsable <code>unsigned int</code>.
     */
    @SuppressWarnings("signedness:argument")
    private UInteger(String value) throws NumberFormatException {
        this.value = rangeCheck(Long.parseLong(value));
    }

    /**
     * Throw exception if value out of range (long version)
     *
     * @param value Value to check
     * @return value if it is in range
     * @throws NumberFormatException if value is out of range
     */
    @SuppressWarnings({"signedness:comparison", "signedness:cast"})
    private static @Unsigned long rangeCheck(@Unsigned long value) throws NumberFormatException {
        if (value < MIN_VALUE || value > MAX_VALUE)
            throw new NumberFormatException("Value is out of range : " + (@Signed long)value);

        return value;
    }

    /**
     * Replace version read through deserialization with cached version.
     *
     * @return cached instance of this object's value if one exists, otherwise
     *         this object
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException {
        UInteger cached;

        // the value read could be invalid so check it
        rangeCheck(value);
        if ((cached = getCached(value)) != null)
            return cached;

        return this;
    }

    @Override
    @SuppressWarnings("allcheckers:return")
    public @PolyValue int intValue(@PolyValue UInteger this) {
        return (int) value;
    }

    @Override
    @SuppressWarnings("allcheckers:return")
    public @PolyValue long longValue(@PolyValue UInteger this) {
        return value;
    }

    @Override
    @SuppressWarnings("value:return")
    public @PolyValue float floatValue(@PolyValue UInteger this) {
        return value;
    }

    @Override
    @SuppressWarnings("value:return")
    public @PolyValue double doubleValue(@PolyValue UInteger this) {
        return value;
    }

    @Override
    @SuppressWarnings("signedness:argument")
    public BigInteger toBigInteger() {
        return BigInteger.valueOf(value);
    }

    @Override
    @SuppressWarnings("signedness:method.invocation")
    public int hashCode() {
        return Long.valueOf(value).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj instanceof UInteger)
            return value == ((UInteger) obj).value;

        return false;
    }

    @Override
    @SuppressWarnings("signedness:method.invocation")
    public String toString() {
        return Long.valueOf(value).toString();
    }

    @Override
    @SuppressWarnings("signedness:comparison")
    public int compareTo(UInteger o) {
        return (value < o.value ? -1 : (value == o.value ? 0 : 1));
    }

    public UInteger add(final UInteger val) {
        return valueOf(value + val.value);
    }

    public UInteger add(final @Unsigned int val) {
        return valueOf(value + val);
    }

    public UInteger subtract(final UInteger val) {
        return valueOf(value - val.value);
    }

    public UInteger subtract(final @Unsigned int val) {
        return valueOf(value - val);
    }
}
