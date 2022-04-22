package com.github.chengjinwu008.kjasd.services

import com.intellij.openapi.project.Project
import com.github.chengjinwu008.kjasd.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
