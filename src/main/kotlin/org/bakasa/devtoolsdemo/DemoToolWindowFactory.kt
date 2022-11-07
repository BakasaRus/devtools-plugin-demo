package org.bakasa.devtoolsdemo

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.ui.content.ContentFactory

class DemoToolWindowFactory: ToolWindowFactory {
    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        val demoToolWindow = DemoToolWindow(toolWindow);
        val contentFactory = ContentFactory.SERVICE.getInstance()
        val content = contentFactory.createContent(demoToolWindow.content, "Demo Tool Window", false)
        toolWindow.contentManager.addContent(content)
    }
}