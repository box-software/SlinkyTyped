package typingsSlinky.multerDashGridfsDashStorage.multerDashGridfsDashStorageMod

import typingsSlinky.mongodb.mongodbMod.Db
import typingsSlinky.mongodb.mongodbMod.MongoClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionResult extends js.Object {
  var client: js.UndefOr[MongoClient] = js.undefined
  var db: Db
}

object ConnectionResult {
  @scala.inline
  def apply(db: Db, client: MongoClient = null): ConnectionResult = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionResult]
  }
}

