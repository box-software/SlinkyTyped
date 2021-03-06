package typingsSlinky.sdpDashTransform.sdpDashTransformMod

import typingsSlinky.sdpDashTransform.Anon_AS
import typingsSlinky.sdpDashTransform.Anon_AddressIpVer
import typingsSlinky.sdpDashTransform.Anon_AddressTypes
import typingsSlinky.sdpDashTransform.Anon_App
import typingsSlinky.sdpDashTransform.Anon_Attribute
import typingsSlinky.sdpDashTransform.Anon_Attrs1
import typingsSlinky.sdpDashTransform.Anon_Codec
import typingsSlinky.sdpDashTransform.Anon_ComponentFoundation
import typingsSlinky.sdpDashTransform.Anon_Config
import typingsSlinky.sdpDashTransform.Anon_ConfigId
import typingsSlinky.sdpDashTransform.Anon_ConfigPayload
import typingsSlinky.sdpDashTransform.Anon_Dir1
import typingsSlinky.sdpDashTransform.Anon_Direction
import typingsSlinky.sdpDashTransform.Anon_Hash
import typingsSlinky.sdpDashTransform.Anon_Ip
import typingsSlinky.sdpDashTransform.Anon_Payload
import typingsSlinky.sdpDashTransform.Anon_PayloadValue
import typingsSlinky.sdpDashTransform.Anon_Semantics
import typingsSlinky.sdpDashTransform.Anon_Value
import typingsSlinky.sdpDashTransform.sdpDashTransformStrings.inactive
import typingsSlinky.sdpDashTransform.sdpDashTransformStrings.recvonly
import typingsSlinky.sdpDashTransform.sdpDashTransformStrings.sendonly
import typingsSlinky.sdpDashTransform.sdpDashTransformStrings.sendrecv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaDescription
  extends MediaAttributes
     with SharedDescriptionFields

object MediaDescription {
  @scala.inline
  def apply(
    fmtp: js.Array[Anon_ConfigPayload],
    rtp: js.Array[Anon_Codec],
    bandwidth: Anon_AS = null,
    candidates: js.Array[Anon_ComponentFoundation] = null,
    connection: Anon_Ip = null,
    control: String = null,
    crypto: Anon_ConfigId = null,
    description: String = null,
    direction: sendrecv | recvonly | sendonly | inactive = null,
    endOfCandidates: String = null,
    ext: js.Array[Anon_Config] = null,
    fingerprint: Anon_Hash = null,
    framerate: Double | String = null,
    icePwd: String = null,
    iceUfrag: String = null,
    imageattrs: js.Array[Anon_Attrs1] = null,
    invalid: js.Array[Anon_Value] = null,
    maxptime: Int | Double = null,
    mid: String = null,
    msid: String = null,
    ptime: Int | Double = null,
    remoteCandidates: String = null,
    rids: js.Array[Anon_Direction] = null,
    rtcp: Anon_AddressIpVer = null,
    rtcpFb: Anon_Payload = null,
    rtcpFbTrrInt: Anon_PayloadValue = null,
    rtcpMux: String = null,
    rtcpRsize: String = null,
    sctpmap: Anon_App = null,
    setup: String = null,
    simulcast: Anon_Dir1 = null,
    simulcast_03: Anon_Value = null,
    sourceFilter: Anon_AddressTypes = null,
    ssrcGroups: js.Array[Anon_Semantics] = null,
    ssrcs: js.Array[Anon_Attribute] = null,
    xGoogleFlag: String = null
  ): MediaDescription = {
    val __obj = js.Dynamic.literal(fmtp = fmtp.asInstanceOf[js.Any], rtp = rtp.asInstanceOf[js.Any])
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth.asInstanceOf[js.Any])
    if (candidates != null) __obj.updateDynamic("candidates")(candidates.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control.asInstanceOf[js.Any])
    if (crypto != null) __obj.updateDynamic("crypto")(crypto.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (endOfCandidates != null) __obj.updateDynamic("endOfCandidates")(endOfCandidates.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (framerate != null) __obj.updateDynamic("framerate")(framerate.asInstanceOf[js.Any])
    if (icePwd != null) __obj.updateDynamic("icePwd")(icePwd.asInstanceOf[js.Any])
    if (iceUfrag != null) __obj.updateDynamic("iceUfrag")(iceUfrag.asInstanceOf[js.Any])
    if (imageattrs != null) __obj.updateDynamic("imageattrs")(imageattrs.asInstanceOf[js.Any])
    if (invalid != null) __obj.updateDynamic("invalid")(invalid.asInstanceOf[js.Any])
    if (maxptime != null) __obj.updateDynamic("maxptime")(maxptime.asInstanceOf[js.Any])
    if (mid != null) __obj.updateDynamic("mid")(mid.asInstanceOf[js.Any])
    if (msid != null) __obj.updateDynamic("msid")(msid.asInstanceOf[js.Any])
    if (ptime != null) __obj.updateDynamic("ptime")(ptime.asInstanceOf[js.Any])
    if (remoteCandidates != null) __obj.updateDynamic("remoteCandidates")(remoteCandidates.asInstanceOf[js.Any])
    if (rids != null) __obj.updateDynamic("rids")(rids.asInstanceOf[js.Any])
    if (rtcp != null) __obj.updateDynamic("rtcp")(rtcp.asInstanceOf[js.Any])
    if (rtcpFb != null) __obj.updateDynamic("rtcpFb")(rtcpFb.asInstanceOf[js.Any])
    if (rtcpFbTrrInt != null) __obj.updateDynamic("rtcpFbTrrInt")(rtcpFbTrrInt.asInstanceOf[js.Any])
    if (rtcpMux != null) __obj.updateDynamic("rtcpMux")(rtcpMux.asInstanceOf[js.Any])
    if (rtcpRsize != null) __obj.updateDynamic("rtcpRsize")(rtcpRsize.asInstanceOf[js.Any])
    if (sctpmap != null) __obj.updateDynamic("sctpmap")(sctpmap.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(setup.asInstanceOf[js.Any])
    if (simulcast != null) __obj.updateDynamic("simulcast")(simulcast.asInstanceOf[js.Any])
    if (simulcast_03 != null) __obj.updateDynamic("simulcast_03")(simulcast_03.asInstanceOf[js.Any])
    if (sourceFilter != null) __obj.updateDynamic("sourceFilter")(sourceFilter.asInstanceOf[js.Any])
    if (ssrcGroups != null) __obj.updateDynamic("ssrcGroups")(ssrcGroups.asInstanceOf[js.Any])
    if (ssrcs != null) __obj.updateDynamic("ssrcs")(ssrcs.asInstanceOf[js.Any])
    if (xGoogleFlag != null) __obj.updateDynamic("xGoogleFlag")(xGoogleFlag.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaDescription]
  }
}

