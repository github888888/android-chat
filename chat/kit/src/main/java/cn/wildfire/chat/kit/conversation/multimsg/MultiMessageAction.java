package cn.wildfire.chat.kit.conversation.multimsg;

import android.content.Context;

import java.util.List;

import cn.wildfire.chat.kit.conversation.ConversationActivity;
import cn.wildfire.chat.kit.conversation.message.model.UiMessage;
import cn.wildfirechat.model.Conversation;

public abstract class MultiMessageAction {
    protected ConversationActivity conversationActivity;
    protected Conversation conversation;

    public MultiMessageAction() {
    }

    public final void onBind(ConversationActivity activity, Conversation conversation) {
        this.conversationActivity = activity;
        this.conversation = conversation;

    }

    public abstract void onClick(List<UiMessage> messages);

    public int priority() {
        return 0;
    }

    public boolean filter(Conversation conversation) {
        return false;
    }

    public abstract int iconResId();

    public abstract String title(Context context);
}