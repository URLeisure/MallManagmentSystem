package com.shi.mall.provider.mapper;

import com.shi.api.model.PmsProductCategory;
import com.shi.api.model.PmsProductCategoryExample;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface PmsProductCategoryMapper {
    @SelectProvider(type = PmsProductCategorySqlProvider.class, method = "countByExample")
    long countByExample(PmsProductCategoryExample example);

    @DeleteProvider(type = PmsProductCategorySqlProvider.class, method = "deleteByExample")
    int deleteByExample(PmsProductCategoryExample example);

    @Delete({
            "delete from pms_product_category",
            "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
            "insert into pms_product_category (id, parent_id, ",
            "name, level, product_count, ",
            "product_unit, nav_status, ",
            "show_status, sort, ",
            "icon, keywords, ",
            "description)",
            "values (#{id,jdbcType=BIGINT}, #{parentId,jdbcType=BIGINT}, ",
            "#{name,jdbcType=VARCHAR}, #{level,jdbcType=INTEGER}, #{productCount,jdbcType=INTEGER}, ",
            "#{productUnit,jdbcType=VARCHAR}, #{navStatus,jdbcType=INTEGER}, ",
            "#{showStatus,jdbcType=INTEGER}, #{sort,jdbcType=INTEGER}, ",
            "#{icon,jdbcType=VARCHAR}, #{keywords,jdbcType=VARCHAR}, ",
            "#{description,jdbcType=LONGVARCHAR})"
    })
    int insert(PmsProductCategory record);

    @InsertProvider(type = PmsProductCategorySqlProvider.class, method = "insertSelective")
    int insertSelective(PmsProductCategory record);

    @SelectProvider(type = PmsProductCategorySqlProvider.class, method = "selectByExampleWithBLOBs")
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT, id = true),
            @Result(column = "parent_id", property = "parentId", jdbcType = JdbcType.BIGINT),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "level", property = "level", jdbcType = JdbcType.INTEGER),
            @Result(column = "product_count", property = "productCount", jdbcType = JdbcType.INTEGER),
            @Result(column = "product_unit", property = "productUnit", jdbcType = JdbcType.VARCHAR),
            @Result(column = "nav_status", property = "navStatus", jdbcType = JdbcType.INTEGER),
            @Result(column = "show_status", property = "showStatus", jdbcType = JdbcType.INTEGER),
            @Result(column = "sort", property = "sort", jdbcType = JdbcType.INTEGER),
            @Result(column = "icon", property = "icon", jdbcType = JdbcType.VARCHAR),
            @Result(column = "keywords", property = "keywords", jdbcType = JdbcType.VARCHAR),
            @Result(column = "description", property = "description", jdbcType = JdbcType.LONGVARCHAR)
    })
    List<PmsProductCategory> selectByExampleWithBLOBs(PmsProductCategoryExample example);

    @SelectProvider(type = PmsProductCategorySqlProvider.class, method = "selectByExample")
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT, id = true),
            @Result(column = "parent_id", property = "parentId", jdbcType = JdbcType.BIGINT),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "level", property = "level", jdbcType = JdbcType.INTEGER),
            @Result(column = "product_count", property = "productCount", jdbcType = JdbcType.INTEGER),
            @Result(column = "product_unit", property = "productUnit", jdbcType = JdbcType.VARCHAR),
            @Result(column = "nav_status", property = "navStatus", jdbcType = JdbcType.INTEGER),
            @Result(column = "show_status", property = "showStatus", jdbcType = JdbcType.INTEGER),
            @Result(column = "sort", property = "sort", jdbcType = JdbcType.INTEGER),
            @Result(column = "icon", property = "icon", jdbcType = JdbcType.VARCHAR),
            @Result(column = "keywords", property = "keywords", jdbcType = JdbcType.VARCHAR)
    })
    List<PmsProductCategory> selectByExample(PmsProductCategoryExample example);

    @Select({
            "select",
            "id, parent_id, name, level, product_count, product_unit, nav_status, show_status, ",
            "sort, icon, keywords, description",
            "from pms_product_category",
            "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT, id = true),
            @Result(column = "parent_id", property = "parentId", jdbcType = JdbcType.BIGINT),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "level", property = "level", jdbcType = JdbcType.INTEGER),
            @Result(column = "product_count", property = "productCount", jdbcType = JdbcType.INTEGER),
            @Result(column = "product_unit", property = "productUnit", jdbcType = JdbcType.VARCHAR),
            @Result(column = "nav_status", property = "navStatus", jdbcType = JdbcType.INTEGER),
            @Result(column = "show_status", property = "showStatus", jdbcType = JdbcType.INTEGER),
            @Result(column = "sort", property = "sort", jdbcType = JdbcType.INTEGER),
            @Result(column = "icon", property = "icon", jdbcType = JdbcType.VARCHAR),
            @Result(column = "keywords", property = "keywords", jdbcType = JdbcType.VARCHAR),
            @Result(column = "description", property = "description", jdbcType = JdbcType.LONGVARCHAR)
    })
    PmsProductCategory selectByPrimaryKey(Long id);

    @UpdateProvider(type = PmsProductCategorySqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("record") PmsProductCategory record, @Param("example") PmsProductCategoryExample example);

    @UpdateProvider(type = PmsProductCategorySqlProvider.class, method = "updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") PmsProductCategory record, @Param("example") PmsProductCategoryExample example);

    @UpdateProvider(type = PmsProductCategorySqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("record") PmsProductCategory record, @Param("example") PmsProductCategoryExample example);

    @UpdateProvider(type = PmsProductCategorySqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PmsProductCategory record);

    @Update({
            "update pms_product_category",
            "set parent_id = #{parentId,jdbcType=BIGINT},",
            "name = #{name,jdbcType=VARCHAR},",
            "level = #{level,jdbcType=INTEGER},",
            "product_count = #{productCount,jdbcType=INTEGER},",
            "product_unit = #{productUnit,jdbcType=VARCHAR},",
            "nav_status = #{navStatus,jdbcType=INTEGER},",
            "show_status = #{showStatus,jdbcType=INTEGER},",
            "sort = #{sort,jdbcType=INTEGER},",
            "icon = #{icon,jdbcType=VARCHAR},",
            "keywords = #{keywords,jdbcType=VARCHAR},",
            "description = #{description,jdbcType=LONGVARCHAR}",
            "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(PmsProductCategory record);

    @Update({
            "update pms_product_category",
            "set parent_id = #{parentId,jdbcType=BIGINT},",
            "name = #{name,jdbcType=VARCHAR},",
            "level = #{level,jdbcType=INTEGER},",
            "product_count = #{productCount,jdbcType=INTEGER},",
            "product_unit = #{productUnit,jdbcType=VARCHAR},",
            "nav_status = #{navStatus,jdbcType=INTEGER},",
            "show_status = #{showStatus,jdbcType=INTEGER},",
            "sort = #{sort,jdbcType=INTEGER},",
            "icon = #{icon,jdbcType=VARCHAR},",
            "keywords = #{keywords,jdbcType=VARCHAR}",
            "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(PmsProductCategory record);

    @Select({
            "select",
            "id, name",
            "from pms_product_category",
            "where parent_id = 0"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT, id = true),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(property = "children", javaType = List.class, column = "id",
                    many = @Many(select = "com.shi.mall.provider.mapper.PmsProductCategoryMapper.selectProductCategoryByParentId"))
    })
    List<PmsProductCategory> listWithChildren();

    @Select({
            "select",
            "id, name",
            "from pms_product_category",
            "where parent_id = #{id,jdbcType=BIGINT}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT, id = true),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR)
    })
    List<PmsProductCategory> selectProductCategoryByParentId(Long id);
}
