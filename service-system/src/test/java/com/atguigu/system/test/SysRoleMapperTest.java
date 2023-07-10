package com.atguigu.system.test;



import com.atguigu.model.system.SysRole;
import com.atguigu.system.mapper.SysRoleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SysRoleMapperTest {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    //1 查询表所有记录
    @Test
    public void findAll() {
        List<SysRole> list = sysRoleMapper.selectList(null);
        for (SysRole sysRole:list) {
            System.out.println(sysRole);
        }
    }

    //2 添加
    @Test
    public void add() {
        SysRole sysRole = new SysRole();
        sysRole.setRoleName("测试角色");
        sysRole.setRoleCode("testcole");
        sysRole.setDescription("卧槽就喜欢测试");
        int rows = sysRoleMapper.insert(sysRole);
        System.out.println(rows);
    }
}
