package com.ruoyi.business.service;

import java.util.List;
import com.ruoyi.business.domain.WtUseCreditPoints;

/**
 * 信用分使用情况Service接口
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
public interface IWtUseCreditPointsService 
{
    /**
     * 查询信用分使用情况
     * 
     * @param id 信用分使用情况主键
     * @return 信用分使用情况
     */
    public WtUseCreditPoints selectWtUseCreditPointsById(Long id);

    /**
     * 查询信用分使用情况列表
     * 
     * @param wtUseCreditPoints 信用分使用情况
     * @return 信用分使用情况集合
     */
    public List<WtUseCreditPoints> selectWtUseCreditPointsList(WtUseCreditPoints wtUseCreditPoints);

    /**
     * 新增信用分使用情况
     * 
     * @param wtUseCreditPoints 信用分使用情况
     * @return 结果
     */
    public int insertWtUseCreditPoints(WtUseCreditPoints wtUseCreditPoints);

    /**
     * 修改信用分使用情况
     * 
     * @param wtUseCreditPoints 信用分使用情况
     * @return 结果
     */
    public int updateWtUseCreditPoints(WtUseCreditPoints wtUseCreditPoints);

    /**
     * 批量删除信用分使用情况
     * 
     * @param ids 需要删除的信用分使用情况主键集合
     * @return 结果
     */
    public int deleteWtUseCreditPointsByIds(Long[] ids);

    /**
     * 删除信用分使用情况信息
     * 
     * @param id 信用分使用情况主键
     * @return 结果
     */
    public int deleteWtUseCreditPointsById(Long id);
}
