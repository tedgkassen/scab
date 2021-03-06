package slackbot.handler

import scala.Tuple3
import scala.collection.immutable.Map
import slack.models.Message

class GroovyDemoHandler implements SlackbotMessageHandler {
    @Override
    Tuple3<Boolean, String, String> handleMessage(Message message, Map<String, String> channels, Map<String, String> users) {
        return new Tuple3<Boolean, String, String>(false, message.channel(), "Groovy handler is live!")
    }
}