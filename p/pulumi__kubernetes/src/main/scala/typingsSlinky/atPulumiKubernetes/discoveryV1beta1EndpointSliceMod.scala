package typingsSlinky.atPulumiKubernetes

import typingsSlinky.atPulumiKubernetes.atPulumiKubernetesStrings.discoveryDotk8sDotioSlashv1beta1
import typingsSlinky.atPulumiKubernetes.typesOutputMod.discovery.v1beta1.Endpoint
import typingsSlinky.atPulumiKubernetes.typesOutputMod.discovery.v1beta1.EndpointPort
import typingsSlinky.atPulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import typingsSlinky.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.outputMod.Output
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/discovery/v1beta1/EndpointSlice", JSImport.Namespace)
@js.native
object discoveryV1beta1EndpointSliceMod extends js.Object {
  @js.native
  class EndpointSlice protected () extends CustomResource {
    /**
      * Create a discovery.v1beta1.EndpointSlice resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typingsSlinky.atPulumiKubernetes.typesInputMod.discovery.v1beta1.EndpointSlice) = this()
    def this(
      name: String,
      args: typingsSlinky.atPulumiKubernetes.typesInputMod.discovery.v1beta1.EndpointSlice,
      opts: CustomResourceOptions
    ) = this()
    /**
      * addressType specifies the type of address carried by this EndpointSlice. All addresses in
      * this slice must be the same type. This field is immutable after creation. The following
      * address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6:
      * Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.
      */
    val addressType: Output[String] = js.native
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output[discoveryDotk8sDotioSlashv1beta1] = js.native
    /**
      * endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of
      * 1000 endpoints.
      */
    val endpoints: Output[js.Array[Endpoint]] = js.native
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output[typingsSlinky.atPulumiKubernetes.atPulumiKubernetesStrings.EndpointSlice] = js.native
    /**
      * Standard object's metadata.
      */
    val metadata: Output[ObjectMeta] = js.native
    /**
      * ports specifies the list of network ports exposed by each endpoint in this slice. Each port
      * must have a unique name. When ports is empty, it indicates that there are no defined ports.
      * When a port is defined with a nil port value, it indicates "all ports". Each slice may
      * include a maximum of 100 ports.
      */
    val ports: Output[js.Array[EndpointPort]] = js.native
  }
  
  /* static members */
  @js.native
  object EndpointSlice extends js.Object {
    /**
      * Get the state of an existing `EndpointSlice` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): EndpointSlice = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): EndpointSlice = js.native
    /**
      * Returns true if the given object is an instance of EndpointSlice.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/discovery/v1beta1/EndpointSlice.EndpointSlice */ Boolean = js.native
  }
  
}

