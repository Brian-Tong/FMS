package com.fms.domain.columnSet;

import lombok.Data;

//列数据实体类
@Data
public class ColumnMapRelation {
    private String id;
    private String columnKey;
    private int tableId;
    private int columnId;
    private int schemaId;
    private long parserId;

}
