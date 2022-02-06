library(shiny)


# Define UI for application that plots random distributions 
shinyUI(pageWithSidebar(
  
  # Application title
  headerPanel("Hello Shiny!"),
  
  # Sidebar with a slider input for number of observations
  sidebarPanel(
#    radioButtons("dia_choice",
#                 "Show Diagram",
#                 c("How long do songs stay in a ranking" = "charts_duration",
#                   "Signs of a song to stay top" = "charts_signs",
#                   "Continents sharing top artists/songs" = "charts_continent",
#                   "Time needed for a song, to get into rankings of neighbouring countires" = "charts_spreading",
#                   "The data itself" = "fetch_data")),
#    dataTableOutput("all_data"),
    sliderInput("obs", 
                "Number of observations:", 
                min = 1,
                max = 300, 
                value = 150)
  ),
  
  # Show a plot of the generated distribution
  mainPanel(
    plotOutput("distPlot"),
    textOutput("dia_choice_server")
  )
))
