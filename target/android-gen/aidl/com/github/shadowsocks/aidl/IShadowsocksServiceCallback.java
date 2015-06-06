/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/zouyiran/IdeaProjects/shadowsocks-android/src/main/aidl/com/github/shadowsocks/aidl/IShadowsocksServiceCallback.aidl
 */
package com.github.shadowsocks.aidl;
public interface IShadowsocksServiceCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.github.shadowsocks.aidl.IShadowsocksServiceCallback
{
private static final java.lang.String DESCRIPTOR = "com.github.shadowsocks.aidl.IShadowsocksServiceCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.github.shadowsocks.aidl.IShadowsocksServiceCallback interface,
 * generating a proxy if needed.
 */
public static com.github.shadowsocks.aidl.IShadowsocksServiceCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.github.shadowsocks.aidl.IShadowsocksServiceCallback))) {
return ((com.github.shadowsocks.aidl.IShadowsocksServiceCallback)iin);
}
return new com.github.shadowsocks.aidl.IShadowsocksServiceCallback.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_stateChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.stateChanged(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.github.shadowsocks.aidl.IShadowsocksServiceCallback
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void stateChanged(int state, java.lang.String msg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(state);
_data.writeString(msg);
mRemote.transact(Stub.TRANSACTION_stateChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_stateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void stateChanged(int state, java.lang.String msg) throws android.os.RemoteException;
}
