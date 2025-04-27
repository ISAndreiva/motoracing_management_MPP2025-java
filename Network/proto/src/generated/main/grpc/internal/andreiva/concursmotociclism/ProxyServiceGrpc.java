package internal.andreiva.concursmotociclism;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.72.0)",
    comments = "Source: service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProxyServiceGrpc {

  private ProxyServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ProxyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.checkUserPasswordRequest,
      internal.andreiva.concursmotociclism.checkUserPasswordResponse> getCheckUserPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "checkUserPassword",
      requestType = internal.andreiva.concursmotociclism.checkUserPasswordRequest.class,
      responseType = internal.andreiva.concursmotociclism.checkUserPasswordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.checkUserPasswordRequest,
      internal.andreiva.concursmotociclism.checkUserPasswordResponse> getCheckUserPasswordMethod() {
    io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.checkUserPasswordRequest, internal.andreiva.concursmotociclism.checkUserPasswordResponse> getCheckUserPasswordMethod;
    if ((getCheckUserPasswordMethod = ProxyServiceGrpc.getCheckUserPasswordMethod) == null) {
      synchronized (ProxyServiceGrpc.class) {
        if ((getCheckUserPasswordMethod = ProxyServiceGrpc.getCheckUserPasswordMethod) == null) {
          ProxyServiceGrpc.getCheckUserPasswordMethod = getCheckUserPasswordMethod =
              io.grpc.MethodDescriptor.<internal.andreiva.concursmotociclism.checkUserPasswordRequest, internal.andreiva.concursmotociclism.checkUserPasswordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "checkUserPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  internal.andreiva.concursmotociclism.checkUserPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  internal.andreiva.concursmotociclism.checkUserPasswordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProxyServiceMethodDescriptorSupplier("checkUserPassword"))
              .build();
        }
      }
    }
    return getCheckUserPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.getRacesByClassRequest,
      internal.andreiva.concursmotociclism.getRacesByClassResponse> getGetRacesByClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRacesByClass",
      requestType = internal.andreiva.concursmotociclism.getRacesByClassRequest.class,
      responseType = internal.andreiva.concursmotociclism.getRacesByClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.getRacesByClassRequest,
      internal.andreiva.concursmotociclism.getRacesByClassResponse> getGetRacesByClassMethod() {
    io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.getRacesByClassRequest, internal.andreiva.concursmotociclism.getRacesByClassResponse> getGetRacesByClassMethod;
    if ((getGetRacesByClassMethod = ProxyServiceGrpc.getGetRacesByClassMethod) == null) {
      synchronized (ProxyServiceGrpc.class) {
        if ((getGetRacesByClassMethod = ProxyServiceGrpc.getGetRacesByClassMethod) == null) {
          ProxyServiceGrpc.getGetRacesByClassMethod = getGetRacesByClassMethod =
              io.grpc.MethodDescriptor.<internal.andreiva.concursmotociclism.getRacesByClassRequest, internal.andreiva.concursmotociclism.getRacesByClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getRacesByClass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  internal.andreiva.concursmotociclism.getRacesByClassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  internal.andreiva.concursmotociclism.getRacesByClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProxyServiceMethodDescriptorSupplier("getRacesByClass"))
              .build();
        }
      }
    }
    return getGetRacesByClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.EmptyRequest,
      internal.andreiva.concursmotociclism.getUsedRaceClassesResponse> getGetUsedRaceClassesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUsedRaceClasses",
      requestType = internal.andreiva.concursmotociclism.EmptyRequest.class,
      responseType = internal.andreiva.concursmotociclism.getUsedRaceClassesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.EmptyRequest,
      internal.andreiva.concursmotociclism.getUsedRaceClassesResponse> getGetUsedRaceClassesMethod() {
    io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.EmptyRequest, internal.andreiva.concursmotociclism.getUsedRaceClassesResponse> getGetUsedRaceClassesMethod;
    if ((getGetUsedRaceClassesMethod = ProxyServiceGrpc.getGetUsedRaceClassesMethod) == null) {
      synchronized (ProxyServiceGrpc.class) {
        if ((getGetUsedRaceClassesMethod = ProxyServiceGrpc.getGetUsedRaceClassesMethod) == null) {
          ProxyServiceGrpc.getGetUsedRaceClassesMethod = getGetUsedRaceClassesMethod =
              io.grpc.MethodDescriptor.<internal.andreiva.concursmotociclism.EmptyRequest, internal.andreiva.concursmotociclism.getUsedRaceClassesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getUsedRaceClasses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  internal.andreiva.concursmotociclism.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  internal.andreiva.concursmotociclism.getUsedRaceClassesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProxyServiceMethodDescriptorSupplier("getUsedRaceClasses"))
              .build();
        }
      }
    }
    return getGetUsedRaceClassesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.getRacersCountForRaceRequest,
      internal.andreiva.concursmotociclism.getRacersCountForRaceResponse> getGetRacersCountForRaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRacersCountForRace",
      requestType = internal.andreiva.concursmotociclism.getRacersCountForRaceRequest.class,
      responseType = internal.andreiva.concursmotociclism.getRacersCountForRaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.getRacersCountForRaceRequest,
      internal.andreiva.concursmotociclism.getRacersCountForRaceResponse> getGetRacersCountForRaceMethod() {
    io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.getRacersCountForRaceRequest, internal.andreiva.concursmotociclism.getRacersCountForRaceResponse> getGetRacersCountForRaceMethod;
    if ((getGetRacersCountForRaceMethod = ProxyServiceGrpc.getGetRacersCountForRaceMethod) == null) {
      synchronized (ProxyServiceGrpc.class) {
        if ((getGetRacersCountForRaceMethod = ProxyServiceGrpc.getGetRacersCountForRaceMethod) == null) {
          ProxyServiceGrpc.getGetRacersCountForRaceMethod = getGetRacersCountForRaceMethod =
              io.grpc.MethodDescriptor.<internal.andreiva.concursmotociclism.getRacersCountForRaceRequest, internal.andreiva.concursmotociclism.getRacersCountForRaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getRacersCountForRace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  internal.andreiva.concursmotociclism.getRacersCountForRaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  internal.andreiva.concursmotociclism.getRacersCountForRaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProxyServiceMethodDescriptorSupplier("getRacersCountForRace"))
              .build();
        }
      }
    }
    return getGetRacersCountForRaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.checkUserExistsRequest,
      internal.andreiva.concursmotociclism.StatusResponse> getCheckUserExistsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "checkUserExists",
      requestType = internal.andreiva.concursmotociclism.checkUserExistsRequest.class,
      responseType = internal.andreiva.concursmotociclism.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.checkUserExistsRequest,
      internal.andreiva.concursmotociclism.StatusResponse> getCheckUserExistsMethod() {
    io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.checkUserExistsRequest, internal.andreiva.concursmotociclism.StatusResponse> getCheckUserExistsMethod;
    if ((getCheckUserExistsMethod = ProxyServiceGrpc.getCheckUserExistsMethod) == null) {
      synchronized (ProxyServiceGrpc.class) {
        if ((getCheckUserExistsMethod = ProxyServiceGrpc.getCheckUserExistsMethod) == null) {
          ProxyServiceGrpc.getCheckUserExistsMethod = getCheckUserExistsMethod =
              io.grpc.MethodDescriptor.<internal.andreiva.concursmotociclism.checkUserExistsRequest, internal.andreiva.concursmotociclism.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "checkUserExists"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  internal.andreiva.concursmotociclism.checkUserExistsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  internal.andreiva.concursmotociclism.StatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProxyServiceMethodDescriptorSupplier("checkUserExists"))
              .build();
        }
      }
    }
    return getCheckUserExistsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.getRacersByTeamRequest,
      internal.andreiva.concursmotociclism.getRacersByTeamResponse> getGetRacersByTeamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRacersByTeam",
      requestType = internal.andreiva.concursmotociclism.getRacersByTeamRequest.class,
      responseType = internal.andreiva.concursmotociclism.getRacersByTeamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.getRacersByTeamRequest,
      internal.andreiva.concursmotociclism.getRacersByTeamResponse> getGetRacersByTeamMethod() {
    io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.getRacersByTeamRequest, internal.andreiva.concursmotociclism.getRacersByTeamResponse> getGetRacersByTeamMethod;
    if ((getGetRacersByTeamMethod = ProxyServiceGrpc.getGetRacersByTeamMethod) == null) {
      synchronized (ProxyServiceGrpc.class) {
        if ((getGetRacersByTeamMethod = ProxyServiceGrpc.getGetRacersByTeamMethod) == null) {
          ProxyServiceGrpc.getGetRacersByTeamMethod = getGetRacersByTeamMethod =
              io.grpc.MethodDescriptor.<internal.andreiva.concursmotociclism.getRacersByTeamRequest, internal.andreiva.concursmotociclism.getRacersByTeamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getRacersByTeam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  internal.andreiva.concursmotociclism.getRacersByTeamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  internal.andreiva.concursmotociclism.getRacersByTeamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProxyServiceMethodDescriptorSupplier("getRacersByTeam"))
              .build();
        }
      }
    }
    return getGetRacersByTeamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.getRacerClassesRequest,
      internal.andreiva.concursmotociclism.getRacerClassesResponse> getGetRacerClassesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRacerClasses",
      requestType = internal.andreiva.concursmotociclism.getRacerClassesRequest.class,
      responseType = internal.andreiva.concursmotociclism.getRacerClassesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.getRacerClassesRequest,
      internal.andreiva.concursmotociclism.getRacerClassesResponse> getGetRacerClassesMethod() {
    io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.getRacerClassesRequest, internal.andreiva.concursmotociclism.getRacerClassesResponse> getGetRacerClassesMethod;
    if ((getGetRacerClassesMethod = ProxyServiceGrpc.getGetRacerClassesMethod) == null) {
      synchronized (ProxyServiceGrpc.class) {
        if ((getGetRacerClassesMethod = ProxyServiceGrpc.getGetRacerClassesMethod) == null) {
          ProxyServiceGrpc.getGetRacerClassesMethod = getGetRacerClassesMethod =
              io.grpc.MethodDescriptor.<internal.andreiva.concursmotociclism.getRacerClassesRequest, internal.andreiva.concursmotociclism.getRacerClassesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getRacerClasses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  internal.andreiva.concursmotociclism.getRacerClassesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  internal.andreiva.concursmotociclism.getRacerClassesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProxyServiceMethodDescriptorSupplier("getRacerClasses"))
              .build();
        }
      }
    }
    return getGetRacerClassesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.getTeamsByPartialNameRequest,
      internal.andreiva.concursmotociclism.getTeamsByPartialNameResponse> getGetTeamsByPartialNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTeamsByPartialName",
      requestType = internal.andreiva.concursmotociclism.getTeamsByPartialNameRequest.class,
      responseType = internal.andreiva.concursmotociclism.getTeamsByPartialNameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.getTeamsByPartialNameRequest,
      internal.andreiva.concursmotociclism.getTeamsByPartialNameResponse> getGetTeamsByPartialNameMethod() {
    io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.getTeamsByPartialNameRequest, internal.andreiva.concursmotociclism.getTeamsByPartialNameResponse> getGetTeamsByPartialNameMethod;
    if ((getGetTeamsByPartialNameMethod = ProxyServiceGrpc.getGetTeamsByPartialNameMethod) == null) {
      synchronized (ProxyServiceGrpc.class) {
        if ((getGetTeamsByPartialNameMethod = ProxyServiceGrpc.getGetTeamsByPartialNameMethod) == null) {
          ProxyServiceGrpc.getGetTeamsByPartialNameMethod = getGetTeamsByPartialNameMethod =
              io.grpc.MethodDescriptor.<internal.andreiva.concursmotociclism.getTeamsByPartialNameRequest, internal.andreiva.concursmotociclism.getTeamsByPartialNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTeamsByPartialName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  internal.andreiva.concursmotociclism.getTeamsByPartialNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  internal.andreiva.concursmotociclism.getTeamsByPartialNameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProxyServiceMethodDescriptorSupplier("getTeamsByPartialName"))
              .build();
        }
      }
    }
    return getGetTeamsByPartialNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.EmptyRequest,
      internal.andreiva.concursmotociclism.getAllTeamsResponse> getGetAllTeamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllTeams",
      requestType = internal.andreiva.concursmotociclism.EmptyRequest.class,
      responseType = internal.andreiva.concursmotociclism.getAllTeamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.EmptyRequest,
      internal.andreiva.concursmotociclism.getAllTeamsResponse> getGetAllTeamsMethod() {
    io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.EmptyRequest, internal.andreiva.concursmotociclism.getAllTeamsResponse> getGetAllTeamsMethod;
    if ((getGetAllTeamsMethod = ProxyServiceGrpc.getGetAllTeamsMethod) == null) {
      synchronized (ProxyServiceGrpc.class) {
        if ((getGetAllTeamsMethod = ProxyServiceGrpc.getGetAllTeamsMethod) == null) {
          ProxyServiceGrpc.getGetAllTeamsMethod = getGetAllTeamsMethod =
              io.grpc.MethodDescriptor.<internal.andreiva.concursmotociclism.EmptyRequest, internal.andreiva.concursmotociclism.getAllTeamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllTeams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  internal.andreiva.concursmotociclism.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  internal.andreiva.concursmotociclism.getAllTeamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProxyServiceMethodDescriptorSupplier("getAllTeams"))
              .build();
        }
      }
    }
    return getGetAllTeamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.addRacerRequest,
      internal.andreiva.concursmotociclism.StatusResponse> getAddRacerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addRacer",
      requestType = internal.andreiva.concursmotociclism.addRacerRequest.class,
      responseType = internal.andreiva.concursmotociclism.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.addRacerRequest,
      internal.andreiva.concursmotociclism.StatusResponse> getAddRacerMethod() {
    io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.addRacerRequest, internal.andreiva.concursmotociclism.StatusResponse> getAddRacerMethod;
    if ((getAddRacerMethod = ProxyServiceGrpc.getAddRacerMethod) == null) {
      synchronized (ProxyServiceGrpc.class) {
        if ((getAddRacerMethod = ProxyServiceGrpc.getAddRacerMethod) == null) {
          ProxyServiceGrpc.getAddRacerMethod = getAddRacerMethod =
              io.grpc.MethodDescriptor.<internal.andreiva.concursmotociclism.addRacerRequest, internal.andreiva.concursmotociclism.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addRacer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  internal.andreiva.concursmotociclism.addRacerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  internal.andreiva.concursmotociclism.StatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProxyServiceMethodDescriptorSupplier("addRacer"))
              .build();
        }
      }
    }
    return getAddRacerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.EmptyRequest,
      internal.andreiva.concursmotociclism.getAllRacesResponse> getGetAllRacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllRaces",
      requestType = internal.andreiva.concursmotociclism.EmptyRequest.class,
      responseType = internal.andreiva.concursmotociclism.getAllRacesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.EmptyRequest,
      internal.andreiva.concursmotociclism.getAllRacesResponse> getGetAllRacesMethod() {
    io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.EmptyRequest, internal.andreiva.concursmotociclism.getAllRacesResponse> getGetAllRacesMethod;
    if ((getGetAllRacesMethod = ProxyServiceGrpc.getGetAllRacesMethod) == null) {
      synchronized (ProxyServiceGrpc.class) {
        if ((getGetAllRacesMethod = ProxyServiceGrpc.getGetAllRacesMethod) == null) {
          ProxyServiceGrpc.getGetAllRacesMethod = getGetAllRacesMethod =
              io.grpc.MethodDescriptor.<internal.andreiva.concursmotociclism.EmptyRequest, internal.andreiva.concursmotociclism.getAllRacesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllRaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  internal.andreiva.concursmotociclism.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  internal.andreiva.concursmotociclism.getAllRacesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProxyServiceMethodDescriptorSupplier("getAllRaces"))
              .build();
        }
      }
    }
    return getGetAllRacesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.addRaceRegistrationRequest,
      internal.andreiva.concursmotociclism.StatusResponse> getAddRaceRegistrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addRaceRegistration",
      requestType = internal.andreiva.concursmotociclism.addRaceRegistrationRequest.class,
      responseType = internal.andreiva.concursmotociclism.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.addRaceRegistrationRequest,
      internal.andreiva.concursmotociclism.StatusResponse> getAddRaceRegistrationMethod() {
    io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.addRaceRegistrationRequest, internal.andreiva.concursmotociclism.StatusResponse> getAddRaceRegistrationMethod;
    if ((getAddRaceRegistrationMethod = ProxyServiceGrpc.getAddRaceRegistrationMethod) == null) {
      synchronized (ProxyServiceGrpc.class) {
        if ((getAddRaceRegistrationMethod = ProxyServiceGrpc.getAddRaceRegistrationMethod) == null) {
          ProxyServiceGrpc.getAddRaceRegistrationMethod = getAddRaceRegistrationMethod =
              io.grpc.MethodDescriptor.<internal.andreiva.concursmotociclism.addRaceRegistrationRequest, internal.andreiva.concursmotociclism.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addRaceRegistration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  internal.andreiva.concursmotociclism.addRaceRegistrationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  internal.andreiva.concursmotociclism.StatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProxyServiceMethodDescriptorSupplier("addRaceRegistration"))
              .build();
        }
      }
    }
    return getAddRaceRegistrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.getRaceByNameRequest,
      internal.andreiva.concursmotociclism.getRaceByNameResponse> getGetRaceByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRaceByName",
      requestType = internal.andreiva.concursmotociclism.getRaceByNameRequest.class,
      responseType = internal.andreiva.concursmotociclism.getRaceByNameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.getRaceByNameRequest,
      internal.andreiva.concursmotociclism.getRaceByNameResponse> getGetRaceByNameMethod() {
    io.grpc.MethodDescriptor<internal.andreiva.concursmotociclism.getRaceByNameRequest, internal.andreiva.concursmotociclism.getRaceByNameResponse> getGetRaceByNameMethod;
    if ((getGetRaceByNameMethod = ProxyServiceGrpc.getGetRaceByNameMethod) == null) {
      synchronized (ProxyServiceGrpc.class) {
        if ((getGetRaceByNameMethod = ProxyServiceGrpc.getGetRaceByNameMethod) == null) {
          ProxyServiceGrpc.getGetRaceByNameMethod = getGetRaceByNameMethod =
              io.grpc.MethodDescriptor.<internal.andreiva.concursmotociclism.getRaceByNameRequest, internal.andreiva.concursmotociclism.getRaceByNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getRaceByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  internal.andreiva.concursmotociclism.getRaceByNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  internal.andreiva.concursmotociclism.getRaceByNameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProxyServiceMethodDescriptorSupplier("getRaceByName"))
              .build();
        }
      }
    }
    return getGetRaceByNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProxyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProxyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProxyServiceStub>() {
        @java.lang.Override
        public ProxyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProxyServiceStub(channel, callOptions);
        }
      };
    return ProxyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ProxyServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProxyServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProxyServiceBlockingV2Stub>() {
        @java.lang.Override
        public ProxyServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProxyServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ProxyServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProxyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProxyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProxyServiceBlockingStub>() {
        @java.lang.Override
        public ProxyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProxyServiceBlockingStub(channel, callOptions);
        }
      };
    return ProxyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProxyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProxyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProxyServiceFutureStub>() {
        @java.lang.Override
        public ProxyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProxyServiceFutureStub(channel, callOptions);
        }
      };
    return ProxyServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void checkUserPassword(internal.andreiva.concursmotociclism.checkUserPasswordRequest request,
        io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.checkUserPasswordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckUserPasswordMethod(), responseObserver);
    }

    /**
     */
    default void getRacesByClass(internal.andreiva.concursmotociclism.getRacesByClassRequest request,
        io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.getRacesByClassResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRacesByClassMethod(), responseObserver);
    }

    /**
     */
    default void getUsedRaceClasses(internal.andreiva.concursmotociclism.EmptyRequest request,
        io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.getUsedRaceClassesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUsedRaceClassesMethod(), responseObserver);
    }

    /**
     */
    default void getRacersCountForRace(internal.andreiva.concursmotociclism.getRacersCountForRaceRequest request,
        io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.getRacersCountForRaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRacersCountForRaceMethod(), responseObserver);
    }

    /**
     */
    default void checkUserExists(internal.andreiva.concursmotociclism.checkUserExistsRequest request,
        io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.StatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckUserExistsMethod(), responseObserver);
    }

    /**
     */
    default void getRacersByTeam(internal.andreiva.concursmotociclism.getRacersByTeamRequest request,
        io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.getRacersByTeamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRacersByTeamMethod(), responseObserver);
    }

    /**
     */
    default void getRacerClasses(internal.andreiva.concursmotociclism.getRacerClassesRequest request,
        io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.getRacerClassesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRacerClassesMethod(), responseObserver);
    }

    /**
     */
    default void getTeamsByPartialName(internal.andreiva.concursmotociclism.getTeamsByPartialNameRequest request,
        io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.getTeamsByPartialNameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTeamsByPartialNameMethod(), responseObserver);
    }

    /**
     */
    default void getAllTeams(internal.andreiva.concursmotociclism.EmptyRequest request,
        io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.getAllTeamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllTeamsMethod(), responseObserver);
    }

    /**
     */
    default void addRacer(internal.andreiva.concursmotociclism.addRacerRequest request,
        io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.StatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddRacerMethod(), responseObserver);
    }

    /**
     */
    default void getAllRaces(internal.andreiva.concursmotociclism.EmptyRequest request,
        io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.getAllRacesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllRacesMethod(), responseObserver);
    }

    /**
     */
    default void addRaceRegistration(internal.andreiva.concursmotociclism.addRaceRegistrationRequest request,
        io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.StatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddRaceRegistrationMethod(), responseObserver);
    }

    /**
     */
    default void getRaceByName(internal.andreiva.concursmotociclism.getRaceByNameRequest request,
        io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.getRaceByNameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRaceByNameMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProxyService.
   */
  public static abstract class ProxyServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProxyServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProxyService.
   */
  public static final class ProxyServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ProxyServiceStub> {
    private ProxyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProxyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProxyServiceStub(channel, callOptions);
    }

    /**
     */
    public void checkUserPassword(internal.andreiva.concursmotociclism.checkUserPasswordRequest request,
        io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.checkUserPasswordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckUserPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRacesByClass(internal.andreiva.concursmotociclism.getRacesByClassRequest request,
        io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.getRacesByClassResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRacesByClassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUsedRaceClasses(internal.andreiva.concursmotociclism.EmptyRequest request,
        io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.getUsedRaceClassesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUsedRaceClassesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRacersCountForRace(internal.andreiva.concursmotociclism.getRacersCountForRaceRequest request,
        io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.getRacersCountForRaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRacersCountForRaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkUserExists(internal.andreiva.concursmotociclism.checkUserExistsRequest request,
        io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.StatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckUserExistsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRacersByTeam(internal.andreiva.concursmotociclism.getRacersByTeamRequest request,
        io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.getRacersByTeamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRacersByTeamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRacerClasses(internal.andreiva.concursmotociclism.getRacerClassesRequest request,
        io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.getRacerClassesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRacerClassesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTeamsByPartialName(internal.andreiva.concursmotociclism.getTeamsByPartialNameRequest request,
        io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.getTeamsByPartialNameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTeamsByPartialNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllTeams(internal.andreiva.concursmotociclism.EmptyRequest request,
        io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.getAllTeamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllTeamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addRacer(internal.andreiva.concursmotociclism.addRacerRequest request,
        io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.StatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddRacerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllRaces(internal.andreiva.concursmotociclism.EmptyRequest request,
        io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.getAllRacesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllRacesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addRaceRegistration(internal.andreiva.concursmotociclism.addRaceRegistrationRequest request,
        io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.StatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddRaceRegistrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRaceByName(internal.andreiva.concursmotociclism.getRaceByNameRequest request,
        io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.getRaceByNameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRaceByNameMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProxyService.
   */
  public static final class ProxyServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ProxyServiceBlockingV2Stub> {
    private ProxyServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProxyServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProxyServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public internal.andreiva.concursmotociclism.checkUserPasswordResponse checkUserPassword(internal.andreiva.concursmotociclism.checkUserPasswordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckUserPasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public internal.andreiva.concursmotociclism.getRacesByClassResponse getRacesByClass(internal.andreiva.concursmotociclism.getRacesByClassRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRacesByClassMethod(), getCallOptions(), request);
    }

    /**
     */
    public internal.andreiva.concursmotociclism.getUsedRaceClassesResponse getUsedRaceClasses(internal.andreiva.concursmotociclism.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUsedRaceClassesMethod(), getCallOptions(), request);
    }

    /**
     */
    public internal.andreiva.concursmotociclism.getRacersCountForRaceResponse getRacersCountForRace(internal.andreiva.concursmotociclism.getRacersCountForRaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRacersCountForRaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public internal.andreiva.concursmotociclism.StatusResponse checkUserExists(internal.andreiva.concursmotociclism.checkUserExistsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckUserExistsMethod(), getCallOptions(), request);
    }

    /**
     */
    public internal.andreiva.concursmotociclism.getRacersByTeamResponse getRacersByTeam(internal.andreiva.concursmotociclism.getRacersByTeamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRacersByTeamMethod(), getCallOptions(), request);
    }

    /**
     */
    public internal.andreiva.concursmotociclism.getRacerClassesResponse getRacerClasses(internal.andreiva.concursmotociclism.getRacerClassesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRacerClassesMethod(), getCallOptions(), request);
    }

    /**
     */
    public internal.andreiva.concursmotociclism.getTeamsByPartialNameResponse getTeamsByPartialName(internal.andreiva.concursmotociclism.getTeamsByPartialNameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTeamsByPartialNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public internal.andreiva.concursmotociclism.getAllTeamsResponse getAllTeams(internal.andreiva.concursmotociclism.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllTeamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public internal.andreiva.concursmotociclism.StatusResponse addRacer(internal.andreiva.concursmotociclism.addRacerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddRacerMethod(), getCallOptions(), request);
    }

    /**
     */
    public internal.andreiva.concursmotociclism.getAllRacesResponse getAllRaces(internal.andreiva.concursmotociclism.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllRacesMethod(), getCallOptions(), request);
    }

    /**
     */
    public internal.andreiva.concursmotociclism.StatusResponse addRaceRegistration(internal.andreiva.concursmotociclism.addRaceRegistrationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddRaceRegistrationMethod(), getCallOptions(), request);
    }

    /**
     */
    public internal.andreiva.concursmotociclism.getRaceByNameResponse getRaceByName(internal.andreiva.concursmotociclism.getRaceByNameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRaceByNameMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ProxyService.
   */
  public static final class ProxyServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProxyServiceBlockingStub> {
    private ProxyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProxyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProxyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public internal.andreiva.concursmotociclism.checkUserPasswordResponse checkUserPassword(internal.andreiva.concursmotociclism.checkUserPasswordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckUserPasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public internal.andreiva.concursmotociclism.getRacesByClassResponse getRacesByClass(internal.andreiva.concursmotociclism.getRacesByClassRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRacesByClassMethod(), getCallOptions(), request);
    }

    /**
     */
    public internal.andreiva.concursmotociclism.getUsedRaceClassesResponse getUsedRaceClasses(internal.andreiva.concursmotociclism.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUsedRaceClassesMethod(), getCallOptions(), request);
    }

    /**
     */
    public internal.andreiva.concursmotociclism.getRacersCountForRaceResponse getRacersCountForRace(internal.andreiva.concursmotociclism.getRacersCountForRaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRacersCountForRaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public internal.andreiva.concursmotociclism.StatusResponse checkUserExists(internal.andreiva.concursmotociclism.checkUserExistsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckUserExistsMethod(), getCallOptions(), request);
    }

    /**
     */
    public internal.andreiva.concursmotociclism.getRacersByTeamResponse getRacersByTeam(internal.andreiva.concursmotociclism.getRacersByTeamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRacersByTeamMethod(), getCallOptions(), request);
    }

    /**
     */
    public internal.andreiva.concursmotociclism.getRacerClassesResponse getRacerClasses(internal.andreiva.concursmotociclism.getRacerClassesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRacerClassesMethod(), getCallOptions(), request);
    }

    /**
     */
    public internal.andreiva.concursmotociclism.getTeamsByPartialNameResponse getTeamsByPartialName(internal.andreiva.concursmotociclism.getTeamsByPartialNameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTeamsByPartialNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public internal.andreiva.concursmotociclism.getAllTeamsResponse getAllTeams(internal.andreiva.concursmotociclism.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllTeamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public internal.andreiva.concursmotociclism.StatusResponse addRacer(internal.andreiva.concursmotociclism.addRacerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddRacerMethod(), getCallOptions(), request);
    }

    /**
     */
    public internal.andreiva.concursmotociclism.getAllRacesResponse getAllRaces(internal.andreiva.concursmotociclism.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllRacesMethod(), getCallOptions(), request);
    }

    /**
     */
    public internal.andreiva.concursmotociclism.StatusResponse addRaceRegistration(internal.andreiva.concursmotociclism.addRaceRegistrationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddRaceRegistrationMethod(), getCallOptions(), request);
    }

    /**
     */
    public internal.andreiva.concursmotociclism.getRaceByNameResponse getRaceByName(internal.andreiva.concursmotociclism.getRaceByNameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRaceByNameMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProxyService.
   */
  public static final class ProxyServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProxyServiceFutureStub> {
    private ProxyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProxyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProxyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<internal.andreiva.concursmotociclism.checkUserPasswordResponse> checkUserPassword(
        internal.andreiva.concursmotociclism.checkUserPasswordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckUserPasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<internal.andreiva.concursmotociclism.getRacesByClassResponse> getRacesByClass(
        internal.andreiva.concursmotociclism.getRacesByClassRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRacesByClassMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<internal.andreiva.concursmotociclism.getUsedRaceClassesResponse> getUsedRaceClasses(
        internal.andreiva.concursmotociclism.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUsedRaceClassesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<internal.andreiva.concursmotociclism.getRacersCountForRaceResponse> getRacersCountForRace(
        internal.andreiva.concursmotociclism.getRacersCountForRaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRacersCountForRaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<internal.andreiva.concursmotociclism.StatusResponse> checkUserExists(
        internal.andreiva.concursmotociclism.checkUserExistsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckUserExistsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<internal.andreiva.concursmotociclism.getRacersByTeamResponse> getRacersByTeam(
        internal.andreiva.concursmotociclism.getRacersByTeamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRacersByTeamMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<internal.andreiva.concursmotociclism.getRacerClassesResponse> getRacerClasses(
        internal.andreiva.concursmotociclism.getRacerClassesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRacerClassesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<internal.andreiva.concursmotociclism.getTeamsByPartialNameResponse> getTeamsByPartialName(
        internal.andreiva.concursmotociclism.getTeamsByPartialNameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTeamsByPartialNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<internal.andreiva.concursmotociclism.getAllTeamsResponse> getAllTeams(
        internal.andreiva.concursmotociclism.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllTeamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<internal.andreiva.concursmotociclism.StatusResponse> addRacer(
        internal.andreiva.concursmotociclism.addRacerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddRacerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<internal.andreiva.concursmotociclism.getAllRacesResponse> getAllRaces(
        internal.andreiva.concursmotociclism.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllRacesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<internal.andreiva.concursmotociclism.StatusResponse> addRaceRegistration(
        internal.andreiva.concursmotociclism.addRaceRegistrationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddRaceRegistrationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<internal.andreiva.concursmotociclism.getRaceByNameResponse> getRaceByName(
        internal.andreiva.concursmotociclism.getRaceByNameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRaceByNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_USER_PASSWORD = 0;
  private static final int METHODID_GET_RACES_BY_CLASS = 1;
  private static final int METHODID_GET_USED_RACE_CLASSES = 2;
  private static final int METHODID_GET_RACERS_COUNT_FOR_RACE = 3;
  private static final int METHODID_CHECK_USER_EXISTS = 4;
  private static final int METHODID_GET_RACERS_BY_TEAM = 5;
  private static final int METHODID_GET_RACER_CLASSES = 6;
  private static final int METHODID_GET_TEAMS_BY_PARTIAL_NAME = 7;
  private static final int METHODID_GET_ALL_TEAMS = 8;
  private static final int METHODID_ADD_RACER = 9;
  private static final int METHODID_GET_ALL_RACES = 10;
  private static final int METHODID_ADD_RACE_REGISTRATION = 11;
  private static final int METHODID_GET_RACE_BY_NAME = 12;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_USER_PASSWORD:
          serviceImpl.checkUserPassword((internal.andreiva.concursmotociclism.checkUserPasswordRequest) request,
              (io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.checkUserPasswordResponse>) responseObserver);
          break;
        case METHODID_GET_RACES_BY_CLASS:
          serviceImpl.getRacesByClass((internal.andreiva.concursmotociclism.getRacesByClassRequest) request,
              (io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.getRacesByClassResponse>) responseObserver);
          break;
        case METHODID_GET_USED_RACE_CLASSES:
          serviceImpl.getUsedRaceClasses((internal.andreiva.concursmotociclism.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.getUsedRaceClassesResponse>) responseObserver);
          break;
        case METHODID_GET_RACERS_COUNT_FOR_RACE:
          serviceImpl.getRacersCountForRace((internal.andreiva.concursmotociclism.getRacersCountForRaceRequest) request,
              (io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.getRacersCountForRaceResponse>) responseObserver);
          break;
        case METHODID_CHECK_USER_EXISTS:
          serviceImpl.checkUserExists((internal.andreiva.concursmotociclism.checkUserExistsRequest) request,
              (io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.StatusResponse>) responseObserver);
          break;
        case METHODID_GET_RACERS_BY_TEAM:
          serviceImpl.getRacersByTeam((internal.andreiva.concursmotociclism.getRacersByTeamRequest) request,
              (io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.getRacersByTeamResponse>) responseObserver);
          break;
        case METHODID_GET_RACER_CLASSES:
          serviceImpl.getRacerClasses((internal.andreiva.concursmotociclism.getRacerClassesRequest) request,
              (io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.getRacerClassesResponse>) responseObserver);
          break;
        case METHODID_GET_TEAMS_BY_PARTIAL_NAME:
          serviceImpl.getTeamsByPartialName((internal.andreiva.concursmotociclism.getTeamsByPartialNameRequest) request,
              (io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.getTeamsByPartialNameResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_TEAMS:
          serviceImpl.getAllTeams((internal.andreiva.concursmotociclism.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.getAllTeamsResponse>) responseObserver);
          break;
        case METHODID_ADD_RACER:
          serviceImpl.addRacer((internal.andreiva.concursmotociclism.addRacerRequest) request,
              (io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.StatusResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_RACES:
          serviceImpl.getAllRaces((internal.andreiva.concursmotociclism.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.getAllRacesResponse>) responseObserver);
          break;
        case METHODID_ADD_RACE_REGISTRATION:
          serviceImpl.addRaceRegistration((internal.andreiva.concursmotociclism.addRaceRegistrationRequest) request,
              (io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.StatusResponse>) responseObserver);
          break;
        case METHODID_GET_RACE_BY_NAME:
          serviceImpl.getRaceByName((internal.andreiva.concursmotociclism.getRaceByNameRequest) request,
              (io.grpc.stub.StreamObserver<internal.andreiva.concursmotociclism.getRaceByNameResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCheckUserPasswordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              internal.andreiva.concursmotociclism.checkUserPasswordRequest,
              internal.andreiva.concursmotociclism.checkUserPasswordResponse>(
                service, METHODID_CHECK_USER_PASSWORD)))
        .addMethod(
          getGetRacesByClassMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              internal.andreiva.concursmotociclism.getRacesByClassRequest,
              internal.andreiva.concursmotociclism.getRacesByClassResponse>(
                service, METHODID_GET_RACES_BY_CLASS)))
        .addMethod(
          getGetUsedRaceClassesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              internal.andreiva.concursmotociclism.EmptyRequest,
              internal.andreiva.concursmotociclism.getUsedRaceClassesResponse>(
                service, METHODID_GET_USED_RACE_CLASSES)))
        .addMethod(
          getGetRacersCountForRaceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              internal.andreiva.concursmotociclism.getRacersCountForRaceRequest,
              internal.andreiva.concursmotociclism.getRacersCountForRaceResponse>(
                service, METHODID_GET_RACERS_COUNT_FOR_RACE)))
        .addMethod(
          getCheckUserExistsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              internal.andreiva.concursmotociclism.checkUserExistsRequest,
              internal.andreiva.concursmotociclism.StatusResponse>(
                service, METHODID_CHECK_USER_EXISTS)))
        .addMethod(
          getGetRacersByTeamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              internal.andreiva.concursmotociclism.getRacersByTeamRequest,
              internal.andreiva.concursmotociclism.getRacersByTeamResponse>(
                service, METHODID_GET_RACERS_BY_TEAM)))
        .addMethod(
          getGetRacerClassesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              internal.andreiva.concursmotociclism.getRacerClassesRequest,
              internal.andreiva.concursmotociclism.getRacerClassesResponse>(
                service, METHODID_GET_RACER_CLASSES)))
        .addMethod(
          getGetTeamsByPartialNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              internal.andreiva.concursmotociclism.getTeamsByPartialNameRequest,
              internal.andreiva.concursmotociclism.getTeamsByPartialNameResponse>(
                service, METHODID_GET_TEAMS_BY_PARTIAL_NAME)))
        .addMethod(
          getGetAllTeamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              internal.andreiva.concursmotociclism.EmptyRequest,
              internal.andreiva.concursmotociclism.getAllTeamsResponse>(
                service, METHODID_GET_ALL_TEAMS)))
        .addMethod(
          getAddRacerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              internal.andreiva.concursmotociclism.addRacerRequest,
              internal.andreiva.concursmotociclism.StatusResponse>(
                service, METHODID_ADD_RACER)))
        .addMethod(
          getGetAllRacesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              internal.andreiva.concursmotociclism.EmptyRequest,
              internal.andreiva.concursmotociclism.getAllRacesResponse>(
                service, METHODID_GET_ALL_RACES)))
        .addMethod(
          getAddRaceRegistrationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              internal.andreiva.concursmotociclism.addRaceRegistrationRequest,
              internal.andreiva.concursmotociclism.StatusResponse>(
                service, METHODID_ADD_RACE_REGISTRATION)))
        .addMethod(
          getGetRaceByNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              internal.andreiva.concursmotociclism.getRaceByNameRequest,
              internal.andreiva.concursmotociclism.getRaceByNameResponse>(
                service, METHODID_GET_RACE_BY_NAME)))
        .build();
  }

  private static abstract class ProxyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProxyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return internal.andreiva.concursmotociclism.Service.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProxyService");
    }
  }

  private static final class ProxyServiceFileDescriptorSupplier
      extends ProxyServiceBaseDescriptorSupplier {
    ProxyServiceFileDescriptorSupplier() {}
  }

  private static final class ProxyServiceMethodDescriptorSupplier
      extends ProxyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProxyServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProxyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProxyServiceFileDescriptorSupplier())
              .addMethod(getCheckUserPasswordMethod())
              .addMethod(getGetRacesByClassMethod())
              .addMethod(getGetUsedRaceClassesMethod())
              .addMethod(getGetRacersCountForRaceMethod())
              .addMethod(getCheckUserExistsMethod())
              .addMethod(getGetRacersByTeamMethod())
              .addMethod(getGetRacerClassesMethod())
              .addMethod(getGetTeamsByPartialNameMethod())
              .addMethod(getGetAllTeamsMethod())
              .addMethod(getAddRacerMethod())
              .addMethod(getGetAllRacesMethod())
              .addMethod(getAddRaceRegistrationMethod())
              .addMethod(getGetRaceByNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
