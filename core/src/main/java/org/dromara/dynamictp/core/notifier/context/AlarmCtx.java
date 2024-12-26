/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dromara.dynamictp.core.notifier.context;

import org.dromara.dynamictp.common.entity.AlarmInfo;
import org.dromara.dynamictp.core.support.ExecutorWrapper;
import org.dromara.dynamictp.common.entity.NotifyItem;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * AlarmCtx related
 *
 * @author yanhom
 * @since 1.0.8
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AlarmCtx extends BaseNotifyCtx {

    private AlarmInfo alarmInfo;

    public AlarmCtx(ExecutorWrapper wrapper, NotifyItem notifyItem) {
        this(wrapper, notifyItem, false, "");
    }

    public AlarmCtx(ExecutorWrapper wrapper, NotifyItem notifyItem, boolean isCommonNotify, String... content) {
        this(wrapper, notifyItem, isCommonNotify, false, content);
    }
    public AlarmCtx(ExecutorWrapper wrapper, NotifyItem notifyItem, boolean isCommonNotify, boolean isToLog, String... content) {
        super(wrapper, notifyItem, isCommonNotify, isToLog, content);
    }
}
