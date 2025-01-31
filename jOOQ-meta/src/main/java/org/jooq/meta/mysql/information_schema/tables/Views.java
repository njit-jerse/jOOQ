/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.mysql.information_schema.tables;


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
import org.jooq.meta.mysql.information_schema.InformationSchema;
import org.jooq.meta.mysql.information_schema.Keys;
import org.jooq.meta.mysql.information_schema.tables.Schemata.SchemataPath;
import org.jooq.meta.mysql.information_schema.tables.Tables.TablesPath;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Views extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.VIEWS</code>
     */
    public static final Views VIEWS = new Views();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.VIEWS.TABLE_CATALOG</code>.
     */
    public final TableField<Record, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.VIEWS.TABLE_SCHEMA</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.VIEWS.TABLE_NAME</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.VIEWS.VIEW_DEFINITION</code>.
     */
    public final TableField<Record, String> VIEW_DEFINITION = createField(DSL.name("VIEW_DEFINITION"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>information_schema.VIEWS.CHECK_OPTION</code>.
     */
    public final TableField<Record, String> CHECK_OPTION = createField(DSL.name("CHECK_OPTION"), SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>information_schema.VIEWS.IS_UPDATABLE</code>.
     */
    public final TableField<Record, String> IS_UPDATABLE = createField(DSL.name("IS_UPDATABLE"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.VIEWS.DEFINER</code>.
     */
    public final TableField<Record, String> DEFINER = createField(DSL.name("DEFINER"), SQLDataType.VARCHAR(288), this, "");

    /**
     * The column <code>information_schema.VIEWS.SECURITY_TYPE</code>.
     */
    public final TableField<Record, String> SECURITY_TYPE = createField(DSL.name("SECURITY_TYPE"), SQLDataType.VARCHAR(7), this, "");

    /**
     * The column <code>information_schema.VIEWS.CHARACTER_SET_CLIENT</code>.
     */
    public final TableField<Record, String> CHARACTER_SET_CLIENT = createField(DSL.name("CHARACTER_SET_CLIENT"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.VIEWS.COLLATION_CONNECTION</code>.
     */
    public final TableField<Record, String> COLLATION_CONNECTION = createField(DSL.name("COLLATION_CONNECTION"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    private Views(Name alias, Table<Record> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Views(Name alias, Table<Record> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>information_schema.VIEWS</code> table reference
     */
    public Views(String alias) {
        this(DSL.name(alias), VIEWS);
    }

    /**
     * Create an aliased <code>information_schema.VIEWS</code> table reference
     */
    public Views(Name alias) {
        this(alias, VIEWS);
    }

    /**
     * Create a <code>information_schema.VIEWS</code> table reference
     */
    public Views() {
        this(DSL.name("VIEWS"), null);
    }

    public <O extends Record> Views(Table<O> path, ForeignKey<O, Record> childPath, InverseForeignKey<O, Record> parentPath) {
        super(path, childPath, parentPath, VIEWS);
    }

    public static class ViewsPath extends Views implements Path<Record> {
        public <O extends Record> ViewsPath(Table<O> path, ForeignKey<O, Record> childPath, InverseForeignKey<O, Record> parentPath) {
            super(path, childPath, parentPath);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public List<ForeignKey<Record, ?>> getReferences() {
        return Arrays.asList(Keys.SYNTHETIC_FK_VIEWS__SYNTHETIC_PK_SCHEMATA, Keys.SYNTHETIC_FK_VIEWS__SYNTHETIC_PK_TABLES);
    }

    private transient SchemataPath _schemata;

    /**
     * Get the implicit join path to the
     * <code>information_schema.SCHEMATA</code> table.
     */
    public SchemataPath schemata() {
        if (_schemata == null)
            _schemata = new SchemataPath(this, Keys.SYNTHETIC_FK_VIEWS__SYNTHETIC_PK_SCHEMATA, null);

        return _schemata;
    }

    private transient TablesPath _tables;

    /**
     * Get the implicit join path to the <code>information_schema.TABLES</code>
     * table.
     */
    public TablesPath tables() {
        if (_tables == null)
            _tables = new TablesPath(this, Keys.SYNTHETIC_FK_VIEWS__SYNTHETIC_PK_TABLES, null);

        return _tables;
    }

    @Override
    public Views as(String alias) {
        return new Views(DSL.name(alias), this);
    }

    @Override
    public Views as(Name alias) {
        return new Views(alias, this);
    }

    @Override
    public Views as(Table<?> alias) {
        return new Views(alias.getQualifiedName(), this);
    }
}
