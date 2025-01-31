/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.hsqldb.information_schema.tables;


import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.hsqldb.information_schema.InformationSchema;
import org.jooq.meta.hsqldb.information_schema.Keys;
import org.jooq.meta.hsqldb.information_schema.tables.Schemata.SchemataPath;


/**
 * one row for each routine
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Routines extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.ROUTINES</code>
     */
    public static final Routines ROUTINES = new Routines();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.SPECIFIC_CATALOG</code>.
     */
    public final TableField<Record, String> SPECIFIC_CATALOG = createField(DSL.name("SPECIFIC_CATALOG"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.SPECIFIC_SCHEMA</code>.
     */
    public final TableField<Record, String> SPECIFIC_SCHEMA = createField(DSL.name("SPECIFIC_SCHEMA"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.SPECIFIC_NAME</code>.
     */
    public final TableField<Record, String> SPECIFIC_NAME = createField(DSL.name("SPECIFIC_NAME"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.ROUTINE_CATALOG</code>.
     */
    public final TableField<Record, String> ROUTINE_CATALOG = createField(DSL.name("ROUTINE_CATALOG"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.ROUTINE_SCHEMA</code>.
     */
    public final TableField<Record, String> ROUTINE_SCHEMA = createField(DSL.name("ROUTINE_SCHEMA"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.ROUTINE_NAME</code>.
     */
    public final TableField<Record, String> ROUTINE_NAME = createField(DSL.name("ROUTINE_NAME"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.ROUTINE_TYPE</code>.
     */
    public final TableField<Record, String> ROUTINE_TYPE = createField(DSL.name("ROUTINE_TYPE"), SQLDataType.VARCHAR(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.MODULE_CATALOG</code>.
     */
    public final TableField<Record, String> MODULE_CATALOG = createField(DSL.name("MODULE_CATALOG"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.MODULE_SCHEMA</code>.
     */
    public final TableField<Record, String> MODULE_SCHEMA = createField(DSL.name("MODULE_SCHEMA"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.MODULE_NAME</code>.
     */
    public final TableField<Record, String> MODULE_NAME = createField(DSL.name("MODULE_NAME"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.UDT_CATALOG</code>.
     */
    public final TableField<Record, String> UDT_CATALOG = createField(DSL.name("UDT_CATALOG"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.UDT_SCHEMA</code>.
     */
    public final TableField<Record, String> UDT_SCHEMA = createField(DSL.name("UDT_SCHEMA"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.UDT_NAME</code>.
     */
    public final TableField<Record, String> UDT_NAME = createField(DSL.name("UDT_NAME"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.DATA_TYPE</code>.
     */
    public final TableField<Record, String> DATA_TYPE = createField(DSL.name("DATA_TYPE"), SQLDataType.VARCHAR(65536), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    public final TableField<Record, Long> CHARACTER_MAXIMUM_LENGTH = createField(DSL.name("CHARACTER_MAXIMUM_LENGTH"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.CHARACTER_OCTET_LENGTH</code>.
     */
    public final TableField<Record, Long> CHARACTER_OCTET_LENGTH = createField(DSL.name("CHARACTER_OCTET_LENGTH"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.CHARACTER_SET_CATALOG</code>.
     */
    public final TableField<Record, String> CHARACTER_SET_CATALOG = createField(DSL.name("CHARACTER_SET_CATALOG"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.CHARACTER_SET_SCHEMA</code>.
     */
    public final TableField<Record, String> CHARACTER_SET_SCHEMA = createField(DSL.name("CHARACTER_SET_SCHEMA"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.CHARACTER_SET_NAME</code>.
     */
    public final TableField<Record, String> CHARACTER_SET_NAME = createField(DSL.name("CHARACTER_SET_NAME"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.COLLATION_CATALOG</code>.
     */
    public final TableField<Record, String> COLLATION_CATALOG = createField(DSL.name("COLLATION_CATALOG"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.COLLATION_SCHEMA</code>.
     */
    public final TableField<Record, String> COLLATION_SCHEMA = createField(DSL.name("COLLATION_SCHEMA"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.COLLATION_NAME</code>.
     */
    public final TableField<Record, String> COLLATION_NAME = createField(DSL.name("COLLATION_NAME"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.NUMERIC_PRECISION</code>.
     */
    public final TableField<Record, Long> NUMERIC_PRECISION = createField(DSL.name("NUMERIC_PRECISION"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.NUMERIC_PRECISION_RADIX</code>.
     */
    public final TableField<Record, Long> NUMERIC_PRECISION_RADIX = createField(DSL.name("NUMERIC_PRECISION_RADIX"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.NUMERIC_SCALE</code>.
     */
    public final TableField<Record, Long> NUMERIC_SCALE = createField(DSL.name("NUMERIC_SCALE"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.DATETIME_PRECISION</code>.
     */
    public final TableField<Record, Long> DATETIME_PRECISION = createField(DSL.name("DATETIME_PRECISION"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.INTERVAL_TYPE</code>.
     */
    public final TableField<Record, String> INTERVAL_TYPE = createField(DSL.name("INTERVAL_TYPE"), SQLDataType.VARCHAR(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.INTERVAL_PRECISION</code>.
     */
    public final TableField<Record, Long> INTERVAL_PRECISION = createField(DSL.name("INTERVAL_PRECISION"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.TYPE_UDT_CATALOG</code>.
     */
    public final TableField<Record, String> TYPE_UDT_CATALOG = createField(DSL.name("TYPE_UDT_CATALOG"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.TYPE_UDT_SCHEMA</code>.
     */
    public final TableField<Record, String> TYPE_UDT_SCHEMA = createField(DSL.name("TYPE_UDT_SCHEMA"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.TYPE_UDT_NAME</code>.
     */
    public final TableField<Record, String> TYPE_UDT_NAME = createField(DSL.name("TYPE_UDT_NAME"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.SCOPE_CATALOG</code>.
     */
    public final TableField<Record, String> SCOPE_CATALOG = createField(DSL.name("SCOPE_CATALOG"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.SCOPE_SCHEMA</code>.
     */
    public final TableField<Record, String> SCOPE_SCHEMA = createField(DSL.name("SCOPE_SCHEMA"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.SCOPE_NAME</code>.
     */
    public final TableField<Record, String> SCOPE_NAME = createField(DSL.name("SCOPE_NAME"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.MAXIMUM_CARDINALITY</code>.
     */
    public final TableField<Record, Long> MAXIMUM_CARDINALITY = createField(DSL.name("MAXIMUM_CARDINALITY"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.DTD_IDENTIFIER</code>.
     */
    public final TableField<Record, String> DTD_IDENTIFIER = createField(DSL.name("DTD_IDENTIFIER"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.ROUTINE_BODY</code>.
     */
    public final TableField<Record, String> ROUTINE_BODY = createField(DSL.name("ROUTINE_BODY"), SQLDataType.VARCHAR(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.ROUTINE_DEFINITION</code>.
     */
    public final TableField<Record, String> ROUTINE_DEFINITION = createField(DSL.name("ROUTINE_DEFINITION"), SQLDataType.VARCHAR(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.EXTERNAL_NAME</code>.
     */
    public final TableField<Record, String> EXTERNAL_NAME = createField(DSL.name("EXTERNAL_NAME"), SQLDataType.VARCHAR(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.EXTERNAL_LANGUAGE</code>.
     */
    public final TableField<Record, String> EXTERNAL_LANGUAGE = createField(DSL.name("EXTERNAL_LANGUAGE"), SQLDataType.VARCHAR(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.PARAMETER_STYLE</code>.
     */
    public final TableField<Record, String> PARAMETER_STYLE = createField(DSL.name("PARAMETER_STYLE"), SQLDataType.VARCHAR(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.IS_DETERMINISTIC</code>.
     */
    public final TableField<Record, String> IS_DETERMINISTIC = createField(DSL.name("IS_DETERMINISTIC"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.SQL_DATA_ACCESS</code>.
     */
    public final TableField<Record, String> SQL_DATA_ACCESS = createField(DSL.name("SQL_DATA_ACCESS"), SQLDataType.VARCHAR(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.IS_NULL_CALL</code>.
     */
    public final TableField<Record, String> IS_NULL_CALL = createField(DSL.name("IS_NULL_CALL"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.SQL_PATH</code>.
     */
    public final TableField<Record, String> SQL_PATH = createField(DSL.name("SQL_PATH"), SQLDataType.VARCHAR(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.SCHEMA_LEVEL_ROUTINE</code>.
     */
    public final TableField<Record, String> SCHEMA_LEVEL_ROUTINE = createField(DSL.name("SCHEMA_LEVEL_ROUTINE"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.MAX_DYNAMIC_RESULT_SETS</code>.
     */
    public final TableField<Record, Long> MAX_DYNAMIC_RESULT_SETS = createField(DSL.name("MAX_DYNAMIC_RESULT_SETS"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.IS_USER_DEFINED_CAST</code>.
     */
    public final TableField<Record, String> IS_USER_DEFINED_CAST = createField(DSL.name("IS_USER_DEFINED_CAST"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.IS_IMPLICITLY_INVOCABLE</code>.
     */
    public final TableField<Record, String> IS_IMPLICITLY_INVOCABLE = createField(DSL.name("IS_IMPLICITLY_INVOCABLE"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.SECURITY_TYPE</code>.
     */
    public final TableField<Record, String> SECURITY_TYPE = createField(DSL.name("SECURITY_TYPE"), SQLDataType.VARCHAR(65536), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.TO_SQL_SPECIFIC_CATALOG</code>.
     */
    public final TableField<Record, String> TO_SQL_SPECIFIC_CATALOG = createField(DSL.name("TO_SQL_SPECIFIC_CATALOG"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.TO_SQL_SPECIFIC_SCHEMA</code>.
     */
    public final TableField<Record, String> TO_SQL_SPECIFIC_SCHEMA = createField(DSL.name("TO_SQL_SPECIFIC_SCHEMA"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.TO_SQL_SPECIFIC_NAME</code>.
     */
    public final TableField<Record, String> TO_SQL_SPECIFIC_NAME = createField(DSL.name("TO_SQL_SPECIFIC_NAME"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.AS_LOCATOR</code>.
     */
    public final TableField<Record, String> AS_LOCATOR = createField(DSL.name("AS_LOCATOR"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.CREATED</code>.
     */
    public final TableField<Record, OffsetDateTime> CREATED = createField(DSL.name("CREATED"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.LAST_ALTERED</code>.
     */
    public final TableField<Record, OffsetDateTime> LAST_ALTERED = createField(DSL.name("LAST_ALTERED"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.NEW_SAVEPOINT_LEVEL</code>.
     */
    public final TableField<Record, String> NEW_SAVEPOINT_LEVEL = createField(DSL.name("NEW_SAVEPOINT_LEVEL"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.IS_UDT_DEPENDENT</code>.
     */
    public final TableField<Record, String> IS_UDT_DEPENDENT = createField(DSL.name("IS_UDT_DEPENDENT"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_FROM_DATA_TYPE</code>.
     */
    public final TableField<Record, String> RESULT_CAST_FROM_DATA_TYPE = createField(DSL.name("RESULT_CAST_FROM_DATA_TYPE"), SQLDataType.VARCHAR(65536), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_AS_LOCATOR</code>.
     */
    public final TableField<Record, String> RESULT_CAST_AS_LOCATOR = createField(DSL.name("RESULT_CAST_AS_LOCATOR"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_CHAR_MAX_LENGTH</code>.
     */
    public final TableField<Record, Long> RESULT_CAST_CHAR_MAX_LENGTH = createField(DSL.name("RESULT_CAST_CHAR_MAX_LENGTH"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_CHAR_OCTET_LENGTH</code>.
     */
    public final TableField<Record, Long> RESULT_CAST_CHAR_OCTET_LENGTH = createField(DSL.name("RESULT_CAST_CHAR_OCTET_LENGTH"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_CHAR_SET_CATALOG</code>.
     */
    public final TableField<Record, String> RESULT_CAST_CHAR_SET_CATALOG = createField(DSL.name("RESULT_CAST_CHAR_SET_CATALOG"), SQLDataType.VARCHAR(65536), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_CHAR_SET_SCHEMA</code>.
     */
    public final TableField<Record, String> RESULT_CAST_CHAR_SET_SCHEMA = createField(DSL.name("RESULT_CAST_CHAR_SET_SCHEMA"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_CHARACTER_SET_NAME</code>.
     */
    public final TableField<Record, String> RESULT_CAST_CHARACTER_SET_NAME = createField(DSL.name("RESULT_CAST_CHARACTER_SET_NAME"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_COLLATION_CATALOG</code>.
     */
    public final TableField<Record, String> RESULT_CAST_COLLATION_CATALOG = createField(DSL.name("RESULT_CAST_COLLATION_CATALOG"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_COLLATION_SCHEMA</code>.
     */
    public final TableField<Record, String> RESULT_CAST_COLLATION_SCHEMA = createField(DSL.name("RESULT_CAST_COLLATION_SCHEMA"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_COLLATION_NAME</code>.
     */
    public final TableField<Record, String> RESULT_CAST_COLLATION_NAME = createField(DSL.name("RESULT_CAST_COLLATION_NAME"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_NUMERIC_PRECISION</code>.
     */
    public final TableField<Record, Long> RESULT_CAST_NUMERIC_PRECISION = createField(DSL.name("RESULT_CAST_NUMERIC_PRECISION"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_NUMERIC_RADIX</code>.
     */
    public final TableField<Record, Long> RESULT_CAST_NUMERIC_RADIX = createField(DSL.name("RESULT_CAST_NUMERIC_RADIX"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_NUMERIC_SCALE</code>.
     */
    public final TableField<Record, Long> RESULT_CAST_NUMERIC_SCALE = createField(DSL.name("RESULT_CAST_NUMERIC_SCALE"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_DATETIME_PRECISION</code>.
     */
    public final TableField<Record, Long> RESULT_CAST_DATETIME_PRECISION = createField(DSL.name("RESULT_CAST_DATETIME_PRECISION"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_INTERVAL_TYPE</code>.
     */
    public final TableField<Record, String> RESULT_CAST_INTERVAL_TYPE = createField(DSL.name("RESULT_CAST_INTERVAL_TYPE"), SQLDataType.VARCHAR(65536), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_INTERVAL_PRECISION</code>.
     */
    public final TableField<Record, Long> RESULT_CAST_INTERVAL_PRECISION = createField(DSL.name("RESULT_CAST_INTERVAL_PRECISION"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_TYPE_UDT_CATALOG</code>.
     */
    public final TableField<Record, String> RESULT_CAST_TYPE_UDT_CATALOG = createField(DSL.name("RESULT_CAST_TYPE_UDT_CATALOG"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_TYPE_UDT_SCHEMA</code>.
     */
    public final TableField<Record, String> RESULT_CAST_TYPE_UDT_SCHEMA = createField(DSL.name("RESULT_CAST_TYPE_UDT_SCHEMA"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_TYPE_UDT_NAME</code>.
     */
    public final TableField<Record, String> RESULT_CAST_TYPE_UDT_NAME = createField(DSL.name("RESULT_CAST_TYPE_UDT_NAME"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_SCOPE_CATALOG</code>.
     */
    public final TableField<Record, String> RESULT_CAST_SCOPE_CATALOG = createField(DSL.name("RESULT_CAST_SCOPE_CATALOG"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_SCOPE_SCHEMA</code>.
     */
    public final TableField<Record, String> RESULT_CAST_SCOPE_SCHEMA = createField(DSL.name("RESULT_CAST_SCOPE_SCHEMA"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_SCOPE_NAME</code>.
     */
    public final TableField<Record, String> RESULT_CAST_SCOPE_NAME = createField(DSL.name("RESULT_CAST_SCOPE_NAME"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_MAX_CARDINALITY</code>.
     */
    public final TableField<Record, Long> RESULT_CAST_MAX_CARDINALITY = createField(DSL.name("RESULT_CAST_MAX_CARDINALITY"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_DTD_IDENTIFIER</code>.
     */
    public final TableField<Record, String> RESULT_CAST_DTD_IDENTIFIER = createField(DSL.name("RESULT_CAST_DTD_IDENTIFIER"), SQLDataType.VARCHAR(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.ROUTINES.DECLARED_DATA_TYPE</code>.
     */
    public final TableField<Record, String> DECLARED_DATA_TYPE = createField(DSL.name("DECLARED_DATA_TYPE"), SQLDataType.VARCHAR(65536), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.DECLARED_NUMERIC_PRECISION</code>.
     */
    public final TableField<Record, Long> DECLARED_NUMERIC_PRECISION = createField(DSL.name("DECLARED_NUMERIC_PRECISION"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.DECLARED_NUMERIC_SCALE</code>.
     */
    public final TableField<Record, Long> DECLARED_NUMERIC_SCALE = createField(DSL.name("DECLARED_NUMERIC_SCALE"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_FROM_DECLARED_DATA_TYPE</code>.
     */
    public final TableField<Record, String> RESULT_CAST_FROM_DECLARED_DATA_TYPE = createField(DSL.name("RESULT_CAST_FROM_DECLARED_DATA_TYPE"), SQLDataType.VARCHAR(65536), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_DECLARED_NUMERIC_PRECISION</code>.
     */
    public final TableField<Record, Long> RESULT_CAST_DECLARED_NUMERIC_PRECISION = createField(DSL.name("RESULT_CAST_DECLARED_NUMERIC_PRECISION"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.ROUTINES.RESULT_CAST_DECLARED_NUMERIC_SCALE</code>.
     */
    public final TableField<Record, Long> RESULT_CAST_DECLARED_NUMERIC_SCALE = createField(DSL.name("RESULT_CAST_DECLARED_NUMERIC_SCALE"), SQLDataType.BIGINT, this, "");

    private Routines(Name alias, Table<Record> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Routines(Name alias, Table<Record> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment("one row for each routine"), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.ROUTINES</code> table
     * reference
     */
    public Routines(String alias) {
        this(DSL.name(alias), ROUTINES);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.ROUTINES</code> table
     * reference
     */
    public Routines(Name alias) {
        this(alias, ROUTINES);
    }

    /**
     * Create a <code>INFORMATION_SCHEMA.ROUTINES</code> table reference
     */
    public Routines() {
        this(DSL.name("ROUTINES"), null);
    }

    public <O extends Record> Routines(Table<O> path, ForeignKey<O, Record> childPath, InverseForeignKey<O, Record> parentPath) {
        super(path, childPath, parentPath, ROUTINES);
    }

    public static class RoutinesPath extends Routines implements Path<Record> {
        public <O extends Record> RoutinesPath(Table<O> path, ForeignKey<O, Record> childPath, InverseForeignKey<O, Record> parentPath) {
            super(path, childPath, parentPath);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public List<ForeignKey<Record, ?>> getReferences() {
        return Arrays.asList(Keys.SYNTHETIC_FK_ROUTINES__SYNTHETIC_PK_SCHEMATA);
    }

    private transient SchemataPath _schemata;

    /**
     * Get the implicit join path to the
     * <code>INFORMATION_SCHEMA.SCHEMATA</code> table.
     */
    public SchemataPath schemata() {
        if (_schemata == null)
            _schemata = new SchemataPath(this, Keys.SYNTHETIC_FK_ROUTINES__SYNTHETIC_PK_SCHEMATA, null);

        return _schemata;
    }

    @Override
    public Routines as(String alias) {
        return new Routines(DSL.name(alias), this);
    }

    @Override
    public Routines as(Name alias) {
        return new Routines(alias, this);
    }

    @Override
    public Routines as(Table<?> alias) {
        return new Routines(alias.getQualifiedName(), this);
    }
}
