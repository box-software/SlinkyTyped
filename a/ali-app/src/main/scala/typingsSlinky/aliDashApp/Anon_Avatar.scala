package typingsSlinky.aliDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Avatar extends js.Object {
  		// 账号的邮箱
  var avatar: String
  		// 账号对应的手机号码
  var email: String
  	// 账号的真实姓名
  var mobile: String
  var realName: String
  		// 账号的头像链接
  var userId: String
}

object Anon_Avatar {
  @scala.inline
  def apply(avatar: String, email: String, mobile: String, realName: String, userId: String): Anon_Avatar = {
    val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], realName = realName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Avatar]
  }
}

