package typingsSlinky.vsoDashNodeDashApi

import typingsSlinky.vsoDashNodeDashApi.clientApiBasesMod.ClientApiBase
import typingsSlinky.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.VssJsonCollectionWrapperV
import typingsSlinky.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typingsSlinky.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typingsSlinky.vsoDashNodeDashApi.interfacesProfileInterfacesMod.Avatar
import typingsSlinky.vsoDashNodeDashApi.interfacesProfileInterfacesMod.CreateProfileContext
import typingsSlinky.vsoDashNodeDashApi.interfacesProfileInterfacesMod.GeoRegion
import typingsSlinky.vsoDashNodeDashApi.interfacesProfileInterfacesMod.Profile
import typingsSlinky.vsoDashNodeDashApi.interfacesProfileInterfacesMod.ProfileAttribute
import typingsSlinky.vsoDashNodeDashApi.interfacesProfileInterfacesMod.ProfileAttributeBase
import typingsSlinky.vsoDashNodeDashApi.interfacesProfileInterfacesMod.ProfileRegions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/ProfileApi", JSImport.Namespace)
@js.native
object profileApiMod extends js.Object {
  @js.native
  trait IProfileApi extends ClientApiBase {
    def createProfile(createProfileContext: CreateProfileContext): js.Promise[Profile] = js.native
    def createProfile(createProfileContext: CreateProfileContext, autoCreate: Boolean): js.Promise[Profile] = js.native
    def deleteProfileAttribute(id: String, descriptor: String): js.Promise[Unit] = js.native
    def getAvatar(id: String): js.Promise[Avatar] = js.native
    def getAvatar(id: String, size: String): js.Promise[Avatar] = js.native
    def getAvatar(id: String, size: String, format: String): js.Promise[Avatar] = js.native
    def getAvatarPreview(container: js.Any, id: String): js.Promise[Avatar] = js.native
    def getAvatarPreview(container: js.Any, id: String, size: String): js.Promise[Avatar] = js.native
    def getAvatarPreview(container: js.Any, id: String, size: String, format: String): js.Promise[Avatar] = js.native
    def getAvatarPreview(container: js.Any, id: String, size: String, format: String, displayName: String): js.Promise[Avatar] = js.native
    def getGeoRegion(ipaddress: String): js.Promise[GeoRegion] = js.native
    def getProfile(id: String): js.Promise[Profile] = js.native
    def getProfile(id: String, details: Boolean): js.Promise[Profile] = js.native
    def getProfile(id: String, details: Boolean, withAttributes: Boolean): js.Promise[Profile] = js.native
    def getProfile(id: String, details: Boolean, withAttributes: Boolean, partition: String): js.Promise[Profile] = js.native
    def getProfile(id: String, details: Boolean, withAttributes: Boolean, partition: String, coreAttributes: String): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: Boolean,
      withAttributes: Boolean,
      partition: String,
      coreAttributes: String,
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    def getProfileAttribute(id: String, descriptor: String): js.Promise[ProfileAttribute] = js.native
    def getProfileAttributes(id: String, partition: String): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(id: String, partition: String, modifiedSince: String): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(id: String, partition: String, modifiedSince: String, modifiedAfterRevision: String): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(
      id: String,
      partition: String,
      modifiedSince: String,
      modifiedAfterRevision: String,
      withCoreAttributes: Boolean
    ): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(
      id: String,
      partition: String,
      modifiedSince: String,
      modifiedAfterRevision: String,
      withCoreAttributes: Boolean,
      coreAttributes: String
    ): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getRegions(): js.Promise[ProfileRegions] = js.native
    def getSupportedLcids(): js.Promise[js.Array[String]] = js.native
    def getUserDefaults(): js.Promise[Profile] = js.native
    def getUserDefaults(includeAvatar: Boolean): js.Promise[Profile] = js.native
    def refreshUserDefaults(id: String): js.Promise[Profile] = js.native
    def resetAvatar(id: String): js.Promise[Unit] = js.native
    def setAvatar(container: js.Any, id: String): js.Promise[Unit] = js.native
    def setProfileAttribute(container: js.Any, id: String, descriptor: String): js.Promise[Unit] = js.native
    def setProfileAttributes(attributesCollection: VssJsonCollectionWrapperV[js.Array[ProfileAttributeBase[_]]], id: String): js.Promise[Unit] = js.native
    def updateProfile(profile: Profile, id: String): js.Promise[Unit] = js.native
  }
  
  @js.native
  class ProfileApi protected () extends IProfileApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
}

