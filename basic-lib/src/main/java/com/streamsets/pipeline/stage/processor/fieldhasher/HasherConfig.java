/**
 * Copyright 2015 StreamSets Inc.
 *
 * Licensed under the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.streamsets.pipeline.stage.processor.fieldhasher;

import com.streamsets.pipeline.api.ConfigDef;
import com.streamsets.pipeline.api.ConfigDefBean;
import com.streamsets.pipeline.api.ListBeanModel;

import java.util.List;

public class HasherConfig {

  @ConfigDefBean(groups = {"RECORD_HASHING"})
  public RecordHasherConfig recordHasherConfig;

  @ConfigDef(
      required = false,
      type = ConfigDef.Type.MODEL,
      label = "Hash to Target",
      description="Hash the source fields to a target field or a header attribute",
      displayPosition = 10,
      group = "FIELD_HASHING"
  )
  @ListBeanModel
  public List<TargetFieldHasherConfig> targetFieldHasherConfigs;

  @ConfigDef(
      required = false,
      type = ConfigDef.Type.MODEL,
      label = "Hash in Place",
      description="Hash the source fields and assign back to themselves.",
      displayPosition = 20,
      group = "FIELD_HASHING"
  )
  @ListBeanModel
  public List<FieldHasherConfig> inPlaceFieldHasherConfigs;

}
