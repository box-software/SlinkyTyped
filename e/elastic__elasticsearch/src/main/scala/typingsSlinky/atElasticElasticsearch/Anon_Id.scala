package typingsSlinky.atElasticElasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: String
  var password: String
  // TODO: remove username and password here in 8
  var username: String
}

object Anon_Id {
  @scala.inline
  def apply(id: String, password: String, username: String): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Id]
  }
}

