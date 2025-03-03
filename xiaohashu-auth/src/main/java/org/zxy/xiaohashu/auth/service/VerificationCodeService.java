package org.zxy.xiaohashu.auth.service;

import com.quanxiaoha.framework.common.response.Response;
import org.zxy.xiaohashu.auth.model.vo.verticationcode.SendVerificationCodeReqVO;


public interface VerificationCodeService {

    /**
     * 发送短信验证码
     *
     * @param sendVerificationCodeReqVO
     * @return
     */
    Response<?> send(SendVerificationCodeReqVO sendVerificationCodeReqVO);
}

