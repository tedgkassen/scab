package slackbot.handler;

import scala.Tuple3;
import slack.models.Message;
import scala.collection.immutable.Map;


/**
 * Created by tkassen on 5/26/17.
 */
public interface SlackBotMessageHandler {
    Tuple3<Boolean, String, String> handleMessage(Message message, Map<String, String> channels, Map<String, String> users);
}