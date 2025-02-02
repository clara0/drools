/*
 * Copyright 2022 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kie.pmml.compiler.commons.factories;

import org.dmg.pmml.Interval;
import org.junit.Test;
import org.kie.pmml.commons.model.expressions.KiePMMLInterval;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.kie.pmml.compiler.api.testutils.PMMLModelTestUtils.getRandomInterval;
import static org.kie.pmml.compiler.commons.factories.InstanceFactoriesTestCommon.commonVerifyKiePMMLInterval;

public class KiePMMLIntervalInstanceFactoryTest {

    @Test
    public void getKiePMMLInterval() {
        Interval toConvert = getRandomInterval();
        KiePMMLInterval retrieved = KiePMMLIntervalInstanceFactory.getKiePMMLInterval(toConvert);
        commonVerifyKiePMMLInterval(retrieved, toConvert);
    }
}