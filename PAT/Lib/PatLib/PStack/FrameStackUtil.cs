using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace PAT.Lib
{
    using Frame = FLenStack<Object>;
    using FrameStack = FStackNode<FLenStack<Object>>;

    class FrameStackUtil
    {
        public static FrameStack create()
        {
            return null;
        }

        public static FrameStack newFrame(FrameStack fs)
        {
            return FrameStack.push(fs, Frame.create());
        }

        public static FrameStack deleteFrame(FrameStack fs)
        {
            return fs.getNext();
        }

        public static FrameStack push(FrameStack fs, Object v)
        {
            Frame x = fs.getValue();
            FrameStack sStack = fs.getNext();

            Frame x2 = Frame.push(x, v);

            return FrameStack.push(sStack, x2);
        }

        public static Object get(FrameStack fs, int frameno, int index)
        {
            Frame x = fs.getAtPos(frameno);
            return x.getFromBottom(index);
        }

    }
}
