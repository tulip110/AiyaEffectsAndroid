/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aiyaapp.aavt.gl;

import android.content.res.Resources;

/**
 * BaseFuncFilter 基础功能滤镜
 *
 * @author wuwang
 * @version v1.0 2017:10:31 11:47
 */
class BaseFuncFilter extends BaseFilter {

    static final String FILTER_SOBEL="shader/func/sobel.frag";
    static final String FILTER_SOBEL_REVERSE="shader/func/sobel2.frag";
    static final String FILTER_GAUSS="shader/func/gauss.frag";

    BaseFuncFilter(Resources resource, String fragment) {
        super(resource, "shader/base.vert", fragment);
        shaderNeedTextureSize(true);
    }
}
