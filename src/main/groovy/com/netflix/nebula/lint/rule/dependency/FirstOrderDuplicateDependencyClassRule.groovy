package com.netflix.nebula.lint.rule.dependency

import org.gradle.api.artifacts.Configuration
import org.gradle.api.artifacts.ModuleVersionIdentifier

class FirstOrderDuplicateDependencyClassRule extends AbstractDuplicateDependencyClassRule {
    @Override
    protected List<ModuleVersionIdentifier> moduleIds(Configuration conf) {
        return firstOrderModuleIds(conf)
    }
}
