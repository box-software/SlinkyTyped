package typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.YouTube.Collection

import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema.LiveChatMessage
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema.LiveChatMessageListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveChatMessagesCollection extends js.Object {
  // Adds a message to a live chat.
  def insert(resource: LiveChatMessage, part: String): LiveChatMessage = js.native
  // Lists live chat messages for a specific chat.
  def list(liveChatId: String, part: String): LiveChatMessageListResponse = js.native
  // Lists live chat messages for a specific chat.
  def list(liveChatId: String, part: String, optionalArgs: js.Object): LiveChatMessageListResponse = js.native
  // Deletes a chat message.
  def remove(id: String): Unit = js.native
}

