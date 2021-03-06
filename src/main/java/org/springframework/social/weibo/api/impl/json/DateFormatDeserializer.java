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

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDeserializer extends JsonDeserializer<Date> {

    public DateFormatDeserializer() {
        super();
    }

    @Override
    public Date deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException {
        try {
            return new SimpleDateFormat(getDateFormat(), Locale.ENGLISH)
                    .parse(jp.getText());
        } catch (ParseException e) {
            return null;
        }
    }

    protected String getDateFormat() {
        return "yyyy-MM-dd HH:mm:ss";
    }

}