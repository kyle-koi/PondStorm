package com.example;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;

public class PondAction extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent e) {
        Messages.showMessageDialog("This is Pond Storm!", "Greeting", Messages.getInformationIcon());
    }
}