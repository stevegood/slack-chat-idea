package rocks.stevegood.idea.slack

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.ui.content.Content
import com.intellij.ui.content.ContentFactory
import org.jetbrains.annotations.NotNull

import javax.swing.JPanel

/**
 * Created by sgood on 9/23/16.
 */
class SlackChannelToolWindowFactory implements ToolWindowFactory {
    ToolWindow slackChannelTW
    JPanel slackChannelTWContent

    @Override
    void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        this.slackChannelTW = toolWindow
        ContentFactory contentFactory = ContentFactory.SERVICE.instance
        Content content = contentFactory.createContent slackChannelTWContent, '', false
        slackChannelTW.contentManager.addContent content
    }
}
