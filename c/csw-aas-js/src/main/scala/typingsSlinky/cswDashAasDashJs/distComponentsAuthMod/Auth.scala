package typingsSlinky.cswDashAasDashJs.distComponentsAuthMod

import typingsSlinky.keycloakDashJs.keycloakDashJsMod.KeycloakProfile
import typingsSlinky.keycloakDashJs.keycloakDashJsMod.KeycloakPromise
import typingsSlinky.keycloakDashJs.keycloakDashJsMod.KeycloakResourceAccess
import typingsSlinky.keycloakDashJs.keycloakDashJsMod.KeycloakRoles
import typingsSlinky.keycloakDashJs.keycloakDashJsMod.KeycloakTokenParsed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth extends js.Object {
  def hasRealmRole(role: String): Boolean = js.native
  def hasResourceRole(role: String): Boolean = js.native
  def hasResourceRole(role: String, resource: String): Boolean = js.native
  def isAuthenticated(): js.UndefOr[Boolean] = js.native
  def loadUserProfile(): KeycloakPromise[KeycloakProfile, Unit] = js.native
  def logout(): KeycloakPromise[Unit, Unit] = js.native
  def logout(options: js.Any): KeycloakPromise[Unit, Unit] = js.native
  def realmAccess(): js.UndefOr[KeycloakRoles] = js.native
  def resourceAccess(): js.UndefOr[KeycloakResourceAccess] = js.native
  def token(): js.UndefOr[String] = js.native
  def tokenParsed(): js.UndefOr[KeycloakTokenParsed] = js.native
}

