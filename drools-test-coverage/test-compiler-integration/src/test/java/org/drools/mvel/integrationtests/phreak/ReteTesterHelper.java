/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.mvel.integrationtests.phreak;

import org.drools.core.base.ClassFieldAccessorCache;
import org.drools.core.definitions.InternalKnowledgePackage;
import org.drools.core.rule.Declaration;
import org.drools.core.spi.BetaNodeFieldConstraint;
import org.drools.mvel.MVELKnowledgePackageImpl;

public class ReteTesterHelper {

    private MVELKnowledgePackageImpl pkg;

    public ReteTesterHelper() {
        this.pkg = new MVELKnowledgePackageImpl("org.drools.examples.manners");
        this.pkg.setClassFieldAccessorCache(new ClassFieldAccessorCache(this.getClass().getClassLoader()));
    }

    public InternalKnowledgePackage getPkg() {
        return pkg;
    }

    public BetaNodeFieldConstraint getBoundVariableConstraint(final Class clazz,
                                                              final String fieldName,
                                                              final Declaration declaration,
                                                              final String evaluatorString) {
        return new FakeBetaNodeFieldConstraint(clazz, fieldName, declaration, evaluatorString);
    }

    public Object getStore() {
        return pkg.getClassFieldAccessorStore();
    }
}
