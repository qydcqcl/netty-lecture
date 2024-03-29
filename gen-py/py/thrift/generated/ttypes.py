#
# Autogenerated by Thrift Compiler (0.12.0)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#
#  options string: py
#

from thrift.Thrift import TType, TMessageType, TFrozenDict, TException, TApplicationException
from thrift.protocol.TProtocol import TProtocolException
from thrift.TRecursive import fix_spec

import sys

from thrift.transport import TTransport
all_structs = []


class Person(object):
    """
    Attributes:
     - username
     - age
     - married

    """


    def __init__(self, username=None, age=None, married=None,):
        self.username = username
        self.age = age
        self.married = married

    def read(self, iprot):
        if iprot._fast_decode is not None and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None:
            iprot._fast_decode(self, iprot, [self.__class__, self.thrift_spec])
            return
        iprot.readStructBegin()
        while True:
            (fname, ftype, fid) = iprot.readFieldBegin()
            if ftype == TType.STOP:
                break
            if fid == 1:
                if ftype == TType.STRING:
                    self.username = iprot.readString().decode('utf-8') if sys.version_info[0] == 2 else iprot.readString()
                else:
                    iprot.skip(ftype)
            elif fid == 2:
                if ftype == TType.I32:
                    self.age = iprot.readI32()
                else:
                    iprot.skip(ftype)
            elif fid == 3:
                if ftype == TType.BOOL:
                    self.married = iprot.readBool()
                else:
                    iprot.skip(ftype)
            else:
                iprot.skip(ftype)
            iprot.readFieldEnd()
        iprot.readStructEnd()

    def write(self, oprot):
        if oprot._fast_encode is not None and self.thrift_spec is not None:
            oprot.trans.write(oprot._fast_encode(self, [self.__class__, self.thrift_spec]))
            return
        oprot.writeStructBegin('Person')
        if self.username is not None:
            oprot.writeFieldBegin('username', TType.STRING, 1)
            oprot.writeString(self.username.encode('utf-8') if sys.version_info[0] == 2 else self.username)
            oprot.writeFieldEnd()
        if self.age is not None:
            oprot.writeFieldBegin('age', TType.I32, 2)
            oprot.writeI32(self.age)
            oprot.writeFieldEnd()
        if self.married is not None:
            oprot.writeFieldBegin('married', TType.BOOL, 3)
            oprot.writeBool(self.married)
            oprot.writeFieldEnd()
        oprot.writeFieldStop()
        oprot.writeStructEnd()

    def validate(self):
        if self.username is None:
            raise TProtocolException(message='Required field username is unset!')
        return

    def __repr__(self):
        L = ['%s=%r' % (key, value)
             for key, value in self.__dict__.items()]
        return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

    def __eq__(self, other):
        return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not (self == other)


class DataException(TException):
    """
    Attributes:
     - message
     - callStack
     - date

    """


    def __init__(self, message=None, callStack=None, date=None,):
        self.message = message
        self.callStack = callStack
        self.date = date

    def read(self, iprot):
        if iprot._fast_decode is not None and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None:
            iprot._fast_decode(self, iprot, [self.__class__, self.thrift_spec])
            return
        iprot.readStructBegin()
        while True:
            (fname, ftype, fid) = iprot.readFieldBegin()
            if ftype == TType.STOP:
                break
            if fid == 1:
                if ftype == TType.STRING:
                    self.message = iprot.readString().decode('utf-8') if sys.version_info[0] == 2 else iprot.readString()
                else:
                    iprot.skip(ftype)
            elif fid == 2:
                if ftype == TType.STRING:
                    self.callStack = iprot.readString().decode('utf-8') if sys.version_info[0] == 2 else iprot.readString()
                else:
                    iprot.skip(ftype)
            elif fid == 3:
                if ftype == TType.STRING:
                    self.date = iprot.readString().decode('utf-8') if sys.version_info[0] == 2 else iprot.readString()
                else:
                    iprot.skip(ftype)
            else:
                iprot.skip(ftype)
            iprot.readFieldEnd()
        iprot.readStructEnd()

    def write(self, oprot):
        if oprot._fast_encode is not None and self.thrift_spec is not None:
            oprot.trans.write(oprot._fast_encode(self, [self.__class__, self.thrift_spec]))
            return
        oprot.writeStructBegin('DataException')
        if self.message is not None:
            oprot.writeFieldBegin('message', TType.STRING, 1)
            oprot.writeString(self.message.encode('utf-8') if sys.version_info[0] == 2 else self.message)
            oprot.writeFieldEnd()
        if self.callStack is not None:
            oprot.writeFieldBegin('callStack', TType.STRING, 2)
            oprot.writeString(self.callStack.encode('utf-8') if sys.version_info[0] == 2 else self.callStack)
            oprot.writeFieldEnd()
        if self.date is not None:
            oprot.writeFieldBegin('date', TType.STRING, 3)
            oprot.writeString(self.date.encode('utf-8') if sys.version_info[0] == 2 else self.date)
            oprot.writeFieldEnd()
        oprot.writeFieldStop()
        oprot.writeStructEnd()

    def validate(self):
        return

    def __str__(self):
        return repr(self)

    def __repr__(self):
        L = ['%s=%r' % (key, value)
             for key, value in self.__dict__.items()]
        return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

    def __eq__(self, other):
        return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not (self == other)
all_structs.append(Person)
Person.thrift_spec = (
    None,  # 0
    (1, TType.STRING, 'username', 'UTF8', None, ),  # 1
    (2, TType.I32, 'age', None, None, ),  # 2
    (3, TType.BOOL, 'married', None, None, ),  # 3
)
all_structs.append(DataException)
DataException.thrift_spec = (
    None,  # 0
    (1, TType.STRING, 'message', 'UTF8', None, ),  # 1
    (2, TType.STRING, 'callStack', 'UTF8', None, ),  # 2
    (3, TType.STRING, 'date', 'UTF8', None, ),  # 3
)
fix_spec(all_structs)
del all_structs
