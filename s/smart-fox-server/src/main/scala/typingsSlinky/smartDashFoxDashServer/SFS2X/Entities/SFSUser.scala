package typingsSlinky.smartDashFoxDashServer.SFS2X.Entities

import typingsSlinky.smartDashFoxDashServer.SFS2X.Entities.Data.Vec3D
import typingsSlinky.smartDashFoxDashServer.SFS2X.Entities.Variables.SFSUserVariable
import typingsSlinky.smartDashFoxDashServer.SFS2X.Managers.UserManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Entities.SFSUser")
@js.native
class SFSUser protected () extends js.Object {
  /**
    * Creates a new SFSUser instance.
    * @param {number}  id     The user id.
    * @param {string}  name   The user name.
    * @param {boolean} [isItMe=false] If true, the user being created corresponds to the current client.
    */
  def this(id: Double, name: String) = this()
  def this(id: Double, name: String, isItMe: Boolean) = this()
  /** @type {Data.Vec3D} Returns the entry point of this user in the current user's AoI. */
  var aoiEntryPoint: Vec3D = js.native
  /** @type {number} Indicates the id of this user. It is unique and it is generated by the server when the user is created. */
  var id: Double = js.native
  /** @type {boolean} Indicates if this SFSUser object represents the current client. */
  var isItMe: Boolean = js.native
  /** @type {string} Indicates the name of this user. Two users in the same Zone can't have the same name. */
  var name: String = js.native
  /** @type {number} Returns the id which identifies the privilege level of this user. */
  var privilegeId: Double = js.native
  /** @type {Object} Defines a generic utility object that can be used to store custom user data. The values added to this object are for client-side use only and are never transmitted to the server or to the other clients. */
  var properties: js.Object = js.native
  /**
    * Indicates whether this user has the specified User Variable set or not.
    * @param  {string}  varName The name of the User Variable whose existance must be checked.
    * @return {boolean}         Returns: true if a User Variable with the passed name is set for this user.
    */
  def containsVariable(varName: String): Boolean = js.native
  /**
    * Returns the playerId value of this user in the passed Room. See the playerId property description for more informations.
    * @param  {SFSRoom} room The SFSRoom object representing the Room to retrieve the player id from.
    * @return {number}       Returns: The playerId of this user in the passed Room.
    */
  def getPlayerId(room: SFSRoom): Double = js.native
  /**
    * Returns a reference to the User Manager which manages this user.
    * @return {Managers.UserManager} Returns: The User Manager to which this user is associated.
    */
  def getUserManager(): UserManager = js.native
  /**
    * Retrieves a User Variable from its name.
    * @param  {string}                    varName The name of the User Variable to be retrieved.
    * @return {Variables.SFSUserVariable}         Returns: The object representing the User Variable, or null if no User Variable with the passed name is associated with this user.
    */
  def getVariable(varName: String): SFSUserVariable = js.native
  /**
    * Retrieves all the User Variables of this user.
    * @return {Variables.SFSUserVariable[]} Returns: The list of SFSUserVariable objects associated with the user.
    */
  def getVariables(): js.Array[SFSUserVariable] = js.native
  /**
    * Indicates whether this user logged in as an administrator or not. Administrator users have the privilegeId property set to UserPrivileges.ADMINISTRATOR.
    * @return {boolean} Returns: true if this user is an administrator.
    */
  def isAdmin(): Boolean = js.native
  /**
    * Indicates whether this user logged in as a guest or not. Guest users have the privilegeId property set to UserPrivileges.GUEST.
    * @return {boolean} Returns: true if this user is a guest.
    */
  def isGuest(): Boolean = js.native
  /**
    * Indicates whether this user joined the passed Room or not.
    * @param  {SFSRoom} room The SFSRoom object representing the Room where to check the user presence.
    * @return {boolean}      Returns: true if this user is inside the passed Room.
    */
  def isJoinedInRoom(room: SFSRoom): Boolean = js.native
  /**
    * Indicates whether this user logged in as a moderator or not. Moderator users have the privilegeId property set to UserPrivileges.MODERATOR.
    * @return {boolean} Returns: true if this user is a moderator.
    */
  def isModerator(): Boolean = js.native
  /**
    * Indicates whether this user is a player (playerId greater than 0) in the last joined Room or not. Non-Game Rooms always return false.
    * @return {boolean} Returns: true if this user is a player in the last joined Room.
    */
  def isPlayer(): Boolean = js.native
  /**
    * Indicates whether this user is a player (playerId greater than 0) in the passed Room or not. Non-Game Rooms always return false.
    * @param  {SFSRoom} room The SFSRoom object representing the Room where to check if this user is a player.
    * @return {boolean}      Returns: true if this user is a player in the passed Room.
    */
  def isPlayerInRoom(room: SFSRoom): Boolean = js.native
  /**
    * Indicates whether this user is a spectator (playerId lower than 0) in the last joined Room or not. Non-Game Rooms always return false.
    * @return {boolean} Returns: true if this user is a spectator in the last joined Room.
    */
  def isSpectator(): Boolean = js.native
  /**
    * Indicates whether this user is a spectator (playerId lower than 0) in the passed Room or not. Non-Game Rooms always return false.
    * @param  {SFSRoom} room The SFSRoom object representing the Room where to check if this user is a spectator.
    * @return {boolean}      Returns: true if this user is a spectator in the passed Room.
    */
  def isSpectatorInRoom(room: SFSRoom): Boolean = js.native
  /**
    * Indicates whether this user logged in as a standard user or not. Standard users have the privilegeId property set to UserPrivileges.STANDARD.
    * @return {boolean} Returns: true if this user is a standard user.
    */
  def isStandardUser(): Boolean = js.native
}

