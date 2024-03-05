/*
 * This file is generated by jOOQ.
 */
package _2fgenerated.tables.records;


import _2fgenerated.tables.InitsTable;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InitsTableRecord extends UpdatableRecordImpl<InitsTableRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.inits_table.id</code>.
     */
    public InitsTableRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.inits_table.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.inits_table.name</code>.
     */
    public InitsTableRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.inits_table.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return InitsTable.INITS_TABLE.ID;
    }

    @Override
    public Field<String> field2() {
        return InitsTable.INITS_TABLE.NAME;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public InitsTableRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public InitsTableRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public InitsTableRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InitsTableRecord
     */
    public InitsTableRecord() {
        super(InitsTable.INITS_TABLE);
    }

    /**
     * Create a detached, initialised InitsTableRecord
     */
    public InitsTableRecord(Integer id, String name) {
        super(InitsTable.INITS_TABLE);

        setId(id);
        setName(name);
    }

    /**
     * Create a detached, initialised InitsTableRecord
     */
    public InitsTableRecord(_2fgenerated.tables.pojos.InitsTable value) {
        super(InitsTable.INITS_TABLE);

        if (value != null) {
            setId(value.getId());
            setName(value.getName());
        }
    }
}