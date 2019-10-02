/*
 * Copyright 2019-2029 geekidea(https://github.com/geekidea)
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.geekidea.springbootplus.shiro.convert;

import io.geekidea.springbootplus.shiro.jwt.JwtToken;
import io.geekidea.springbootplus.shiro.vo.JwtTokenRedisVo;
import io.geekidea.springbootplus.shiro.vo.LoginSysUserRedisVo;
import io.geekidea.springbootplus.shiro.vo.LoginSysUserVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author geekidea
 * @date 2019-09-30
 * @since 1.3.0.RELEASE
 **/
@Mapper
public interface ShiroMapstructConvert {

    ShiroMapstructConvert INSTANCE = Mappers.getMapper(ShiroMapstructConvert.class);

    LoginSysUserRedisVo loginSysUserVoToLoginSysUserRedisVo(LoginSysUserVo loginSysUserVo);

    JwtTokenRedisVo jwtTokenToJwtTokenRedisVo(JwtToken jwtToken);
}
