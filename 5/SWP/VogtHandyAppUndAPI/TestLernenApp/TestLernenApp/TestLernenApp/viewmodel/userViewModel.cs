using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Text;
using System.Windows.Input;
using TestLernenApp.API;
using TestLernenApp.model;
using Xamarin.Forms;

namespace TestLernenApp.viewmodel
{
    class userViewModel : common.BindingBase
    {
        
        private string eingabe;
        public userViewModel()
        {
            PickUp = new ObservableCollection<string>();
            PickUp.Add("Mann");
            PickUp.Add("Trans");
            PickUp.Add("Frauen");

            Users = new ObservableCollection<User>();
            Users.Add(new User("Daniel", "Niederhauser", new DateTime(2002, 02, 02)));
            Users.Add(new User("Niklas", "Niederhauser", new DateTime(2002, 02, 02)));
            Users.Add(new User("Sebi", "Niederhauser", new DateTime(2002, 02, 03)));

        }


        public string Eingabe { 
            get 
            {
                return this.eingabe;
            } 
            set
            {
                this.eingabe = value;
                this.RaisePropertyChanged(nameof(Eingabe));
            }
        }

        public ObservableCollection<String> PickUp { get; set; }
        public DateTime Datum { get; set; }

        private ObservableCollection<User> _users;


        public ObservableCollection<User> Users {
            get
            {
                return this._users;
            }
            set
            {
                this._users = value;
                this.RaisePropertyChanged(nameof(Users));
            }
        }

        public ICommand cmdKnopf => new Command(executeCommand, canExecuteCommand);
        public bool canExecuteCommand()
        {
            return Eingabe != "";
        }
        public void executeCommand()
        {
            APIManager.postUserToAPI(Eingabe);
        }
    }
}
