package com.bigdata.mybatis.controller;

import com.bigdata.mybatis.bean.ShuqiUser;
import com.bigdata.mybatis.dto.ShuqiUserDTO;
import com.bigdata.mybatis.service.ShuqiUserService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShuqiUserController {

    @Autowired
    ShuqiUserService shuqiUserService;

    @RequestMapping("/shuqi")
    public String getShuqiUsers(){

        List<ShuqiUser> shuqiUsers = shuqiUserService.list();


        return shuqiUsers.toString();
    }


    @RequestMapping("/sex")
    public String getShuqiUserSexCount(){

        List<ShuqiUserDTO> userSexCount = shuqiUserService.getUserSexCount();

        try {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("success", true);
            jsonObject.put("label", "男女人数统计");
            JSONArray jsonArray = new JSONArray();

            for (ShuqiUserDTO shuqiUserDTO : userSexCount) {
                String sex = shuqiUserDTO.getSex();
                int cnt = shuqiUserDTO.getCnt();
                jsonArray.put(sex);
                jsonArray.put(cnt);
//                jsonObject.put("content", jsonArray);
                System.out.println(jsonArray.toString());
            }
//            System.out.println(jsonObject1);
            jsonObject.put("content", jsonArray);
            return jsonObject.toString();
        } catch (Exception e){
            JSONObject jsonObject = new JSONObject();
            try {
                jsonObject.put("success",false);
                jsonObject.put("message","数据获取失败");
            } catch (JSONException jsonException) {

            }
            return jsonObject.toString();
        }

    }
}
