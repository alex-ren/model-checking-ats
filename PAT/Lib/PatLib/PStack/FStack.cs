using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using PAT.Lib;

namespace PAT.Lib
{ 

    public class FStack<T>
    {
        private T m_v;
        private FStack<T> m_tail;

        public FStack()
        {
            throw new System.Exception();
        }

        public FStack(T x, FStack<T> s)
        {
            m_v = x;
            m_tail = s;
        }

        public static FStack<T> newFStack()
        {
            return null;
        }

        public static FStack<T> push(FStack<T> s, T x)
        {
            return new FStack<T>(x, s);
        }

        public static FStack<T> pop(FStack<T> s)
        {
            return s.m_tail;
        }

        public static T get(FStack<T> s, int pos)
        {
            while (pos > 0)
            {
                s = s.m_tail;
                pos--;
            }
            return s.m_v;
        }

        public static bool isEmpty(FStack<T> s)
        {
            return null == s;
        }

        public override string ToString()
        {
            return "[" + encode() + "]";
        }

        private string encode()
        {
            FStack<T> s = this;
            String returnString = "";
            do
            {
                if (null != s.m_v)
                {
                    returnString += s.m_v.ToString() + ", ";
                }
                else
                {
                    returnString += "null" + ", ";
                }
                s = s.m_tail;
            } while (null != s);

            if (returnString.Length > 0)
            {
                returnString = returnString.Substring(0, returnString.Length - 2);
            }

            return returnString;
        }

        public string ExpressionID
        {
            get
            {
                return encode();
            }
        }
    }

}
