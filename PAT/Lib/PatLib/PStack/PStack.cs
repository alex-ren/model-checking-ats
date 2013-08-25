using System;
using System.Collections.Generic;
using System.Text;
using PAT.Common.Classes.Expressions.ExpressionClass;

using PAT.Lib;
//the namespace must be PAT.Lib, the class and method names can be arbitrary
namespace PAT.Lib
{
    using Frame = FLenStack<Object>;
    using FrameStack = FStackNode<FLenStack<Object>>;

    /// <summary>
    /// The math library that can be used in your model.
    /// all methods should be declared as public static.
    /// 
    /// The parameters must be of type "int", or "int array"
    /// The number of parameters can be 0 or many
    /// 
    /// The return type can be bool, int or int[] only.
    /// 
    /// The method name will be used directly in your model.
    /// e.g. call(max, 10, 2), call(dominate, 3, 2), call(amax, [1,3,5]),
    /// 
    /// Note: method names are case sensetive
    /// </summary>
    public class PStack : ExpressionValue
    {

        private List<FrameStack> m_stacks;

        public PStack()
        {
            this.m_stacks = new List<FrameStack>();
        }

        public PStack(List<FrameStack> ss)
        {
            m_stacks = ss;
        }

        public void addStack()
        {
            FrameStack t = FrameStackUtil.create();
            m_stacks.Add(t);
        }

        public void newFrame(int tid)
        {
            FrameStack sf = m_stacks[tid];  // stack of frames
            m_stacks[tid] = FrameStackUtil.newFrame(sf);
        }

        public void deleteFrame(int tid)
        {
            FrameStack sf = m_stacks[tid];  // stack of frames
            m_stacks[tid] = FrameStackUtil.deleteFrame(sf);
        }

        public void push(int tid, int v)
        {
            FrameStack sf = m_stacks[tid];  // stack of frames
            m_stacks[tid] = FrameStackUtil.push(sf, v);
        }

        public int get(int tid, int frame, int index)
        {
            FrameStack sf = m_stacks[tid];  // stack of frames
            return (int)FrameStackUtil.get(sf, frame, index);
        }

        /// <summary>
        /// Please implement this method to provide the string representation of the datatype
        /// </summary>
        /// <returns></returns>
        public override string ToString()
        {
            return "[" + encode() + "]";
        }


        /// <summary>
        /// Please implement this method to return a deep clone of the current object
        /// </summary>
        /// <returns></returns>
        public override ExpressionValue GetClone()
        {
            List<FrameStack> fsLst = new List<FrameStack>(m_stacks);
            return new PStack(fsLst);
        }

        private string encode()
        {
            String returnString = "";
            foreach (FrameStack sf in m_stacks)
            {
                if (FrameStack.isEmpty(sf))
                {
                    returnString += "[], ";
                }
                else
                {
                    returnString += sf.ToString() + ", ";
                }
            }

            if (returnString.Length > 0)
            {
                returnString = returnString.Substring(0, returnString.Length - 2);
            }

            return returnString;
        }

        /// <summary>
        /// Please implement this method to provide the compact string representation of the datatype
        /// </summary>
        /// <returns></returns>
        public override string ExpressionID
        {
            get
            {
                return encode();
            }
        }

    }
}
