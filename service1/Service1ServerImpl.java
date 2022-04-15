package com.service1;

import io.grpc.BindableService;
import io.grpc.ServerServiceDefinition;

public final class Service1ServerImpl implements BindableService{
		  Service1ServerImpl() {}
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
		      "\n\020newService.proto\"%\n\016containsString\022\023\n\013" +
		      "firstString\030\n \001(\t\"\037\n\013newResponse\022\020\n\010firs" +
		      "tInt\030\001 \001(\0052\374\001\n\nnewService\0224\n\016GetFirstStr" +
		      "ing\022\017.containsString\032\017.containsString\"\000\022" +
		      ".\n\013GetFirstInt\022\017.containsString\032\014.newRes" +
		      "ponse\"\000\022E\n\035GetFirstStringServerStreaming" +
		      "\022\017.containsString\032\017.containsString\"\0000\001\022A" +
		      "\n\031SendStringClientStreaming\022\017.containsSt" +
		      "ring\032\017.containsString\"\000(\001B#\n\017grpc.newSer" +
		      "viceB\016NewServiceImplP\001b\006proto3"
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
		@Override
		public ServerServiceDefinition bindService() {
			// TODO Auto-generated method stub
			return null;
		}

		  // @@protoc_insertion_point(outer_class_scope)
		}



