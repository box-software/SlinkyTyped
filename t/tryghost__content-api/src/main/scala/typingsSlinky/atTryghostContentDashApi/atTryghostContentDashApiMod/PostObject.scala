package typingsSlinky.atTryghostContentDashApi.atTryghostContentDashApiMod

import typingsSlinky.atTryghostContentDashApi.Anon_Pagination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostObject extends js.Object {
  var meta: Anon_Pagination
  var posts: js.Array[PostOrPage]
}

object PostObject {
  @scala.inline
  def apply(meta: Anon_Pagination, posts: js.Array[PostOrPage]): PostObject = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], posts = posts.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PostObject]
  }
}

