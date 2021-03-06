package typingsSlinky.emojiDashMart

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.emojiDashMart.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData
import typingsSlinky.emojiDashMart.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiEntry
import typingsSlinky.emojiDashMart.emojiDashMartStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("emoji-mart/dist-es/utils/emoji-index/emoji-index", JSImport.Namespace)
@js.native
object distDashEsUtilsEmojiDashIndexEmojiDashIndexMod extends js.Object {
  // tslint:disable-next-line strict-export-declare-modifiers
  @js.native
  object default extends js.Object {
    var emojis: StringDictionary[EmojiEntry] = js.native
    /** Mapping of string to keyof emojis */
    var emoticons: StringDictionary[String] = js.native
    def search(query: String): js.Array[EmojiData] | Null = js.native
    def search(query: _empty): Null = js.native
  }
  
}

