package typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Collection

import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema.UserProfile
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema.UserProfileList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfilesCollection extends js.Object {
  // Gets one user profile by ID.
  def get(profileId: String): UserProfile
  // Retrieves list of user profiles for a user.
  def list(): UserProfileList
}

object UserProfilesCollection {
  @scala.inline
  def apply(get: String => UserProfile, list: () => UserProfileList): UserProfilesCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction0(list))
  
    __obj.asInstanceOf[UserProfilesCollection]
  }
}

