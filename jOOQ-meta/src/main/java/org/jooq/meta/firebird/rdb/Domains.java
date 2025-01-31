/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.firebird.rdb;


import org.jooq.Domain;
import org.jooq.Schema;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.LazySchema;
import org.jooq.impl.SQLDataType;


/**
 * Convenience access to all Domains in the default schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Domains {

    /**
     * The domain <code>RDB$PROCEDURE_PARAMETERS</code>.
     */
    public static final Domain<Short> RDB$PROCEDURE_PARAMETERS = Internal.createDomain(
          schema()
        , DSL.name("RDB$PROCEDURE_PARAMETERS")
        , SQLDataType.SMALLINT
    );

    private static final Schema schema() {
        return new LazySchema(DSL.name(""), DSL.comment(""), () -> null);
    }
}
