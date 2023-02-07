using System;
using System.Collections.Generic;
using System.Text;

namespace TestLernenApp.model
{
    class User
    {
        public User(string firstname, string lastname, DateTime age)
        {
            this.firstname = firstname;
            this.lastname = lastname;
            this.age = age;
        }

        public String firstname { get; set; }
        public User()
        {

        }
        public String lastname { get; set; }
        public DateTime age { get; set; }
    }
}
