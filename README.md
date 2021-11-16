User flow for SuperHeroes

* User types a search term
* We query the local database for matches in 'results for' return the data if found (100% match)
* If not, we call the API IF the user has internet access
* The data is persisted locally in the models prescribed
* The Local storage is queried to supply the details for our DetailsView
* If there is no access to internet, we query LocalDb once more but this time searching terms 'like' our search term
* If this returns nothing as well, we go ahead and tell the user there is no data available
* If the database has some data in it, we suggest that they scroll through to see whats available
* If they are interested, we getAllEntries() from LocalDb and present them in a list

					*********** the End ***********
