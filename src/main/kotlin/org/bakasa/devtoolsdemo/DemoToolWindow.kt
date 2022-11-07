package org.bakasa.devtoolsdemo

import com.intellij.openapi.wm.ToolWindow
import java.util.*
import javax.swing.JButton
import javax.swing.JComponent
import javax.swing.JLabel
import javax.swing.JPanel


class DemoToolWindow(toolWindow: ToolWindow?) {
    private var panel: JPanel? = null
    private var inner: JLabel? = null
    private var refreshButton: JButton? = null

    init {
        val instance = Calendar.getInstance()
        refreshButton?.addActionListener {
            inner?.text = instance.time.toString()
        }
        inner?.text = instance.time.toString()
    }

    val content: JComponent?
        get() = panel
}