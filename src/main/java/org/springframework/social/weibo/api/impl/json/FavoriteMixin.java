/*
 * Copyright 2011 France Telecom R&D Beijing Co., Ltd 北京法国电信研发中心有限公司
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.weibo.api.impl.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.springframework.social.weibo.api.Status;

import java.util.Date;

/**
 * Annotated mixin to add Jackson annotations to Favorite.
 *
 * @author edva8332
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class FavoriteMixin {

    @JsonIgnoreProperties(ignoreUnknown = true)
    abstract static class TagMixin {
        long id;
        @JsonProperty("tag")
        String value;
        int count;
    }

    @JsonProperty("status")
    Status status;
    @JsonProperty("favorited_time")
    @JsonDeserialize(using = TimelineDateDeserializer.class)
    Date favoritedTime;
}
