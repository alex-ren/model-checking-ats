﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using PAT.Lib;

namespace PAT.Lib
{

    public class FStackNode<T>
    {
        private T m_v;
        private FStackNode<T> m_tail;

        private FStackNode(T x, FStackNode<T> s)
        {
            m_v = x;
            m_tail = s;
        }

        public static FStackNode<T> create()
        {
            return null;
        }

        public static FStackNode<T> push(FStackNode<T> s, T x)
        {
            return new FStackNode<T>(x, s);
        }

        public T getValue()
        {
            return m_v;
        }

        public FStackNode<T> getNext()
        {
            return m_tail;
        }

        public T getAtPos(int pos)
        {
            FStackNode<T> node = this;
            while (pos > 0)
            {
                node = node.getNext();
                pos--;
            }

            return node.getValue();
        }

        public static bool isEmpty(FStackNode<T> s)
        {
            return null == s;
        }

        public override string ToString()
        {
            return "[" + encode() + "]";
        }

        private string encode()
        {
            FStackNode<T> s = this;
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