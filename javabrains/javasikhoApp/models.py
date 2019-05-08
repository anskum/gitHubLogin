from django.db import models



class Topics(models.Model):
    Sub = models.CharField(max_length =128)
    Title = models.CharField(max_length =128)
    Link = models.CharField(max_length =256 , unique = True)
# Create your models here.
