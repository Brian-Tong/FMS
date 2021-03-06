package com.fms.service.columnSet;

        import com.fms.domain.columnSet.*;
        import com.fms.domain.filemanage.FileInput;
        import com.fms.domain.filemanage.User;
        import com.handu.apollo.data.mybatis.Dao;
        import org.apache.ibatis.annotations.Param;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import com.handu.apollo.utils.CharPool;

        import java.util.List;
        import java.util.Map;

/**
 * @author lib 2018/12/13
 */
@Service
public class ColumnSetService {

    public static final String CLASSNAME = ColumnSetService.class.getName() + CharPool.PERIOD;
    @Autowired
    private Dao dao;

    public List<ColumnInfo> getDicNameByTableId(int tid){
        return dao.getList(CLASSNAME,"getDicNameByTableId",tid);
    }
    public List<ColumnInfo> getColumnsForTable(int tid){
        return dao.getList(CLASSNAME,"getColumnsForTable",tid);
    }
    public List<SchemaInfo> getAllSchemas(Map<String, Object> params) {
        return dao.getList(CLASSNAME, "getAllSchemas", params);
    }
    public List<TableInfo> getTablesBySchemaId(int sid){
        return dao.getList(CLASSNAME,"getTablesBySchemaId",sid);
    }
    public List<Map<String,Object>> getDicColumnsByDicName(String dicName) {
        return dao.getList(CLASSNAME, "getDicColumnsByDicName", dicName);
    }
    public void insertColumnMapRelation(ColumnMapRelation cmr) {
        dao.insert(CLASSNAME, "insertColumnMapRelation", cmr);
    }
    public void insertColumnDic(ColumnDic cd) {
        dao.insert(CLASSNAME, "insertColumnDic", cd);
    }
    public TableInfo getTableNameByTableId(int table_id){
        return dao.get(CLASSNAME,"getTableNameByTableId",table_id);
    }

    public ColumnInfo getColumnInfo(int cid){
        return dao.get(CLASSNAME,"getColumnInfo",cid);
    }

}
