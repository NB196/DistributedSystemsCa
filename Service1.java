// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service1.proto

package com.service1;

public final class Service1 {
  private Service1() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_containsString_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_containsString_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_newResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_newResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016service1.proto\"%\n\016containsString\022\023\n\013fi" +
      "rstString\030\n \001(\t\"\037\n\013newResponse\022\020\n\010firstI" +
      "nt\030\001 \001(\0052\372\001\n\010service1\0224\n\016GetFirstString\022" +
      "\017.containsString\032\017.containsString\"\000\022.\n\013G" +
      "etFirstInt\022\017.containsString\032\014.newRespons" +
      "e\"\000\022E\n\035GetFirstStringServerStreaming\022\017.c" +
      "ontainsString\032\017.containsString\"\0000\001\022A\n\031Se" +
      "ndStringClientStreaming\022\017.containsString" +
      "\032\017.containsString\"\000(\001B\032\n\014com.service1B\010S" +
      "ervice1P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_containsString_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_containsString_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_containsString_descriptor,
        new java.lang.String[] { "FirstString", });
    internal_static_newResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_newResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_newResponse_descriptor,
        new java.lang.String[] { "FirstInt", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
