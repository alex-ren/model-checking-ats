using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using PAT.Lib;

namespace LibTester
{
    class Program
    {
        static void Main(string[] args)
        {
            System.Console.WriteLine("hello world");
            IntHolder ih = new IntHolder(3);

            PStack ps = new PStack();
            ps.addStack();
            ps.newFrame(0);
            ps.newFrame(0);
            ps.push(0, 2);
            ps.get(0, 0);
            ps.push(0, 3);
            System.Console.WriteLine(ps.ToString());
            ps.get(0, 1);
            ps.deleteFrame(0);
            ps.push(0, 33);


        }
    }
}
